package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public interface Flag {
             List<Color> getColors();
     }
    public class DutchFlag implements Flag {
          public List<Color> getColors() {
               Returns Array.asList(color. RED, color.WHITE, color. BLUE)
              }
    }
    public class ItalianFlag implements Flag {
          public List<Color> getColors() {
               Returns Array.asList(color.GREEN, color.WHITE, color.RED)
              }
   }
   private static final Map<Nationality, Flag> FLAGS =
         new HashMap<Nationality, Flag>();

       static {
         FLAGS.put (DUTCH, new Ducth.Flag());
         FLAGS.put (GERMAN, new German.Flag());
         FLAGS.put (BELGIAN, new Belgian.Flag());
         FLAGS.put (FRENCH, new French.Flag());
         FLAGS.put (ITALIAN, new Italian.Flag());
         FLAGS.put (ROMANIA, new Romania.Flag());
         FLAGS.put (IRELAND, new Irland.Flag());
         FLAGS.put (HUNGARIAN, new Hungarian.Flag());
         FLAGS.put (BULGARIAN, new Bulgarian.Flag());
         FLAGS.put (RUSSIA, new Russia.Flag());
    
  }

     public List<Color> getFlagColors(Nationality nationality) {
        Flag flag = FLAGS.get(nationality);
        flag = flag != null ? flag : new DefaultFlag();
        Return flag.getColors(); 
 }

    // end::getFlag[]

}
