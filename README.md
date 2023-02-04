Założenia

1. Interfejs Block implementuje klasa BlockImp 
2. Interfejs CompositeBklock implementuje klasa CompositeBlockImp. Klasa CompositeBlockImp posiada listę dwóch bloków, z których złożony jest blok kompozytowy. 
3. Kolor bloku kompozytowego  wyznaczony jest przez pierwszy blok dodawany przy implementacji (block1).
4. Materiał bloku kompozytowego wyznaczony jest przez drugi blok dodawany przy implementacji (block2).
5. Klasa Wall implementuje interfejs Structure oraz metody findBlockByColor, findBlocksByMaterial oraz count.
6. Klasa Wall zawiera również metodę implementList, dzięki której możemy dodać do klasy istniejącą listę bloków.
7. Testy metod bez użycia JUnit można znaleźć w klasie Main.
8. Test metod przy użyciu JUnit można znaleźć w folderze test>java .
9. Komentarze w kodzie są w języku angielskim.
