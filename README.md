# Założenia dla zadania

- Interfejs Block implementuje klasa BlockImp 
- Interfejs CompositeBklock implementuje klasa CompositeBlockImp. Klasa CompositeBlockImp posiada listę dwóch bloków, z których złożony jest blok kompozytowy. 
- Kolor bloku kompozytowego  wyznaczony jest przez pierwszy blok dodawany przy implementacji (block1).
- Materiał bloku kompozytowego wyznaczony jest przez drugi blok dodawany przy implementacji (block2).
- Klasa Wall implementuje interfejs Structure oraz metody findBlockByColor, findBlocksByMaterial oraz count.
- Klasa Wall zawiera również metodę implementList, dzięki której możemy dodać do klasy istniejącą listę bloków.
- Testy metod bez użycia JUnit można znaleźć w klasie Main.
- Test metod przy użyciu JUnit można znaleźć w folderze test>java .
- Komentarze w kodzie są w języku angielskim.

