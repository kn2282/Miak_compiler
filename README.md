# Interpreter Canvas
### Autorzy: Krzysztof Niedziela i Michał Jasiński

## Używanie interpretera
Przykładowe wywołanie interpretera:

jcc.bat input.cnv -o output.js

Gdzie:

jcc.bat - ścieżka do interpretera

input.cnv - plik wejściowy

output.js - plik wyjściowy (zostanie utworzony)

Opisy flag:

-o | --output	plik wyjściowy

-i | --input	plik wejściowy (gdy nie podajemy go jako pierwszego)

-s | --show	wyświetla wynik w przeglądarce

–-show-only	nie zapisuje wyniku, a jedynie go wyświetla

Interpreter spróbuje przetłumaczyć zawartość pliku wejściowego i wynik zapisać do pliku output.js lub innego podanego. 
Wyświetlanie pliku polega na zapisaniu kodu (w plikach index.html oraz main.js) w folderze show, a następnie wyświetlenie kodu strony w przeglądarce (w niektórych systemach otwarcie strony nie działa wtedy trzeba otworzyć ją ręcznie).
Wynikowy kod odwołuje się do kontekstu canvas jako ctx.
Objaśnienie znaków w dokumentacji
Nawiasy kwadratowe oznaczają opcjonalność, zawartość nawiasów ostrych jest kontekstowa, np. <ciąg instrukcji> oznacza jedną lub więcej instrukcji np. rysowania, definiowania pętli lub operacji na zmiennych.

## Komentarze
Znaki w komentarzu będą ignorowane. Przykład:

    var1=var1+5	//<treść komentarza ignorowana przez interpreter>

## Debug
Instrukcja DEBUG służy do wypisania wszystkich zmiennych w pamięci, w odpowiednich zasięgach.

## Rysunki

    DRAW <figura> (<kolor> | RGB(int,int,int) | #hex) [FILL] [ROTATED int]

Kolor może mieć postać nazwy koloru z wielkich liter, czyli m. in. RED, GREEN, BLUE itd., napisu heksadecymalnego ze znakiem ‘#’, czyli np #FFA900 lub RGB(r,g,b) gdzie kolejne wartości odpowiadają odpowiednim składowym kolorów. Opcja FILL oznacza wypełnienie figury, (dotyczy figur, które można wypełnić) a ROTATED deg obrócenie jej o deg stopni zgodnie z ruchem wskazówek zegara. Obrót dokonuje się względem środka figury.

## Figury
### Prostokąt
    RECTANGLE(x,y,width,height)
### Linia
    LINE(from_x,from_y,to_x,to_y)
### Koło
    CIRCLE(x,y,r)

## Funkcje
### Definicja
W ciele funkcji można odwołać się do argumentów nie widocznych poza nią. Zasięg wyższy dla funkcji to zasięg, w którym funkcja ta została zdefiniowana.
  

  DEF nazwa_funkcji(argument1,argument2,...)
    <ciąg instrukcji>
  END DEF

funkcję wywołuje się nazwą funkcji i wartościami argumentów
    
    nazwa_funkcji(1,2,3)

## Bloki
Bloki mają osobną pamięć, choć można z nich odwoływać się do zmiennych z wyższych zasięgów. Zmienne obecnego zasięgu będą przesłaniać pozostałe.
### Definicja

    BLOCK
      <ciąg instrukcji>
    END BLOCK

## Pętle
### Definicja

    WHILE condition :
      <ciąg instrukcji>
    END
  
Ciąg instrukcji w ciele pętli będzie wykonywał się tak długo, jak długo warunek condition będzie prawdziwy

## Wyrażenia
Przez wyrażenia rozumie się stałe wartości liczbowe, zmienne lub wartości wyrażeń matematycznych: dodawania, odejmowania, mnożenia i dzielenia. Interpreter uwzględnia nawiasowanie. Przykładowe wyrażenie:

        (x/2)+5*(y-1)

## Zmienne
### Definicja

        nazwa_zmiennej=wyrażenie

## Zasięgi
Odczytując wartość zmiennej, interpreter stara się znaleźć zmienną w obecnym zasięgu. Jeśli to się nie uda, szuka w zasięgu wyżej itd. Przypisując do zmiennej wartość, interpreter przypisze wartość do zmiennej w obecnym zasięgu

## Operatory ^ i ^^
Operatory ^ i ^^ służą do modyfikowania powyższego zachowania. Użycie ^ przed nazwą odczytywanej zmiennej spowoduje że jeśli istnieje zasięg wyższy od obecnego, interpreter nie będzie szukał zmiennej w obecnym zasięgu, tylko zacznie szukać wyżej. W przypadku przypisania wartości do zmiennej z operatorem ^, interpreter będzie próbował operować na pamięci w wyższym zasięgu.
Użycie operatora ^^ przed zmiennymi sygnalizuje operatorowi odwołanie do zmiennych zdefiniowanych w zasięgu globalnym. Przykład użycia:
      

        global=10
        
        DEF double()
          ^^global=2*global
        END DEF
        
        double()
      
Powyższy przykład demonstruje podwojenie zmiennej globalnej, z wnętrza bloku.

## Pobieranie
Kompletna wersja interpretera znajduje się w pliku import_version.zip .
Jedyne wymagania to system windows, oraz interface języka java (maszyna wirtualna).
skrypt uruchamiający znajduje się w import_version\compiler\jcc.bat .

