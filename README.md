<h1><a id="Warsztaty_I_Java_0"></a>Warsztaty I Java</h1>
<hr>
<h1><a id="Gra_w_zgadywanie_liczb_2"></a>Gra w zgadywanie liczb</h1>
<p>Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100.<br>
Następnie:</p>
<ol>
<li>wypisać: “Zgadnij liczbę” i pobrać liczbę z klawiatury;</li>
<li>sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: “To nie jest liczba”, po czym wrócić do pkt. 1;</li>
<li>jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: “Za mało!”, po czym wrócić do pkt. 1;</li>
<li>jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: “Za dużo!”, po czym wrócić do pkt. 1;</li>
<li>jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: “Zgadłeś!”, po czym zakończyć działanie programu</li>
</ol>
<h1><a id="Symulator_LOTTO_11"></a>Symulator LOTTO</h1>
<p>Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49.<br>
Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6<br>
poprawnych liczb.<br>
Napisz program, który:</p>
<ul>
<li>zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:<br>
–  czy wprowadzony ciąg znaków jest poprawną liczbą,<br>
– czy użytkownik nie wpisał tej liczby już poprzednio,<br>
– czy liczba należy do zakresu 1-49,</li>
<li>po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,</li>
<li>wylosuje 6 liczb z zakresu i wyświetli je na ekranie,</li>
<li>poinformuje gracza, czy trafił przynajmniej “trójkę”.</li>
</ul>
<h1><a id="Gra_w_zgadywanie_liczb_2_23"></a>Gra w zgadywanie liczb 2</h1>
<p>Odwróćmy teraz sytuację z warsztatu “Gra w zgadywanie liczb”: to użytkownik pomyśli sobie liczbę z zakresu 1-1000, a komputer będzie zgadywał i zrobi to maksymalnie w 10 ruchach (pod warunkiem, że gracz nie będzie oszukiwał).<br>
Zadaniem gracza będzie udzielanie odpowiedzi “więcej”, “mniej”, “trafiłeś”.<br>
Na następnym slajdzie znajduje się schemat blokowy algorytmu.<br>
Dostępny jest także pod adresem:<br>
<a href="https://gist.github.com/arek-jozwiak-coderslab/4783d45e75a71793a123673cc0998ae3">https://gist.github.com/arek-jozwiak-coderslab/4783d45e75a71793a123673cc0998ae3</a><br>
Zaimplementuj go w Javie.</p>
<h1><a id="Kostka_do_gry_30"></a>Kostka do gry</h1>
<p>Napisz funkcję, która:</p>
<ol>
<li>przyjmie w parametrze taki kod w postaci String,</li>
<li>rozpozna wszystkie dane wejściowe:<br>
– rodzaj kostki,<br>
– liczbę rzutów,<br>
– modyfikator,</li>
<li>wykona symulację rzutów i zwróci wynik.</li>
</ol>
<p>Typy kostek występujące w grach:<br>
D3, D4, D6, D8, D10, D12, D20, D100.</p>
<h1><a id="Wyszukiwarka_najpopularniejszych_sw_42"></a>Wyszukiwarka najpopularniejszych słów</h1>
<ul>
<li>Wywołaj pobieranie dla wybranych serwisów internetowych.</li>
<li>Pomiń wszystkie elementy krótsze niż 3-znakowe.</li>
<li>Utwórz tablicę elementów wykluczonych np. oraz, ponieważ</li>
<li>Wczytaj utworzony plik popular_words.txt i na jego podstawie utwórz plik filtered_popular_words.txt, który zawierać będzie wszystkie znalezione słowa, pomijając słowa wykluczone.</li>
</ul>