package pl.edu.agh;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import pl.edu.agh.Interpreter.CanvasGrammarParser;
import pl.edu.agh.Interpreter.CanvasGrammarLexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static String source_path = null;
    public static String output_path = "output.js";
    public static String show_path = System.getProperty("user.dir")+"\\show";
    public static boolean show=false;

    public static void main(String[] args) {


        if (!parse_args(args)){
            System.exit(1);
        }

        //CanvasGrammarLexer lexer = new CanvasGrammarLexer((CharStream) fr);
        CanvasGrammarLexer lexer = null;
        try {
            lexer = new CanvasGrammarLexer(CharStreams.fromFileName(source_path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        lexer.removeErrorListeners();
        lexer.addErrorListener(CanvasErrorHandler.INSTANCE);
        // CanvasGrammarLexer lexer = new CanvasGrammarLexer(CharStreams.fromString("var=19\nDRAW RECTANGLE(10+10,10*10,var,var-10) RED\n"));
        CanvasGrammarParser parser = new CanvasGrammarParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(CanvasErrorHandler.INSTANCE);
        CanvasMainListener listener = new CanvasMainListener(parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree tree = parser.program();
        walker.walk(listener,tree);
        OutputWriter.save_output();


        if (show){
            OutputWriter.save_show();
            try {
                Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", ";", new File("show/index.html").getAbsolutePath()});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //parser.program();
    }

    public static class OutputWriter{
        static String totalOutput = "";
        private static final String HTML_SHOW_CODE;

        static {
            HTML_SHOW_CODE =
                    "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Document</title>\n" +
                    "\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<canvas id=\"myCanvas\" width=\"1280\" height=\"720\" style=\"border:1px solid #000000;\">\n" +
                    "\n" +
                    "</canvas>\n" +
                    "</body>\n" +
                    "<script>\n" +
                    "        var c = document.getElementById(\"myCanvas\");\n" +
                    "        var ctx = c.getContext(\"2d\");\n" +
                    "</script>\n" +
                    "<script src=\"main.js\"></script>\n" +
                    "\n" +
                    "</html>\n";
        }


        public static void add(String str){
            totalOutput += str + "\n";
        }

        public static void save_output(){
            if (output_path != null){
                File output = new File(output_path);
                if (!output.exists()){
                    try {
                        output.createNewFile();
                    } catch (IOException e) {
                        System.err.println("error while creating output file!");
                        e.printStackTrace();
                    }
                }
                try {
                    FileWriter fr = new FileWriter(output, false);
                    fr.write(totalOutput);
                    fr.close();
                } catch (IOException e) {
                    System.err.println("error while saving to output file!!!");
                    e.printStackTrace();
                }
            }

        }

        public static void save_show(){
            if (show_path != null){
                File show_dir = new File(show_path);
                if (!show_dir.exists()){
                    show_dir.mkdir();
                }
                try {
                    File show_js = new File(show_path+"\\main.js");
                    if (!show_js.exists()){
                        show_js.createNewFile();
                    }
                    File show_html = new File(show_path+"\\index.html");
                    if (!show_html.exists()){
                        show_html.createNewFile();
                    }
                    FileWriter fr = new FileWriter(show_js, false);
                    fr.write(totalOutput);
                    fr.close();
                    FileWriter fr_html = new FileWriter(show_html, false);
                    fr_html.write(HTML_SHOW_CODE);
                    fr_html.close();
                } catch (IOException e) {
                    System.err.println("error while saving show bufor!!!");
                    e.printStackTrace();
                }
            }
        }

    }

    private static boolean parse_args(String[] args){
        boolean path_output_arg=false, path_input_arg=true;
        for (String arg :
                args) {
            switch (arg) {
                case "--show":
                case "-s":
                    show = true;
                    break;
                case "--output":
                case "-o":
                    path_output_arg=true;
                    path_input_arg=false;
                    break;
                case "--input":
                case "-i":
                    path_output_arg=false;
                    path_input_arg=true;
                    break;
                case "--show-only":
                    output_path = null;
                    show = true;
                    break;
                default:
                    if (path_input_arg){
                        source_path = arg;
                        path_input_arg=false;
                        break;
                    }
                    if (path_output_arg){
                        output_path = arg;
                        path_output_arg=false;
                        break;
                    }
                    System.err.println("incorrect arguments! error at " + arg);
                    return false;
            }
        }
        if (source_path == null){
            System.err.println("source path not given!");
            return false;
        }
        if (! new File(source_path).exists()){
            System.err.println("source file: ["+ source_path +"] not found!");
            return false;
        }
        return true;
    }

}
