import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileParserTest {
    @Test
    public void shouldReadOneLineOfInputAndGetQuantityOfItem(){
        String inputLine = "1 book at 12.49";
        int expectedQuantity = 1;
        Item item = FileParser.parseLine(inputLine);
        int actualQuantity = item.getQuantity();
        assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void shouldReadOneLineOfInputAndGetItemName(){
        String inputLine = "1 book at 12.49";
        String expectedName = "book";
        Item item = FileParser.parseLine(inputLine);
        String actualName = item.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void shouldReadOneLineOfInputAndGetItemPrice(){
        String inputLine = "1 book at 12.49";
        double expectedPrice = 12.49;
        Item item = FileParser.parseLine(inputLine);
        double actualPrice = item.getPrice();
        assertEquals(expectedPrice, actualPrice, 0);
    }
}