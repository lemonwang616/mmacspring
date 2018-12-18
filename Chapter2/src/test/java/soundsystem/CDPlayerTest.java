package java.soundsystem;
import static org.junit.Assert.*;

import main.java.soundsystem.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=main.java.soundsystem.CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        Assert.hasText(
                "Playing Somthing just like this. by The Chainsmokers;ColdPlay\n",
                systemOutRule.getLog());

    }

}
