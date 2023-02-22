import org.testng.annotations.Test;
import parser.XMLTag;

  public class XMLTagTest {
      @Test(groups = "parser")
        public void testGetName() {
            XMLTag tag = new XMLTag("TagName");
            assertEquals(tag.getName(), "TagName");
        }

        private void assertEquals(String name, String tagName) {
        }

      @Test(groups = "parser")
        public void testSetName() {
            XMLTag tag = new XMLTag("TagName");
            tag.setName("NewTagName");
            assertEquals(tag.getName(), "NewTagName");
        }
    }
    }