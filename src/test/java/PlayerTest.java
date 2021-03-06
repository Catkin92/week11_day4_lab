import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void before() {
        player = new Player();
        card = new Card(SuitType.CLUBS, RankType.TEN);
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.countHand());
    }

    @Test
    public void canAddCard() {
        player.addCard(card);
        assertEquals(1, player.countHand());
    }
}
