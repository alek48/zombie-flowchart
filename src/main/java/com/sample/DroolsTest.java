package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import javax.swing.JOptionPane;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
	// TODO: Research - Does this make sense? I know it's simpler to expose the expert system to the entire JOptionPane interface, but doesn't this violate
	// the intended separation between the user interface and the knowledge base?
    public static class UserInterface extends JOptionPane {

		private static final long serialVersionUID = 1L;
		private static final String blurb = "THE APOCALYPSE";
<<<<<<< HEAD

		public static void displayTextbox(String contents, int type) {
        	showMessageDialog(null, contents, blurb, type);
        }
		
=======
		private static final String[] button_end = {"END"};
		private static final String[] button_continue = {"Continue"};

		public static void displayTextbox(String contents) {
			showOptionDialog(null, contents, blurb, 0, PLAIN_MESSAGE, null, button_continue, null);
        }
		
		public static void displayOutcome(String contents) {
			showOptionDialog(null, contents, blurb, 0, PLAIN_MESSAGE, null, button_end, null);
		}
		
>>>>>>> 151537c450cc8452bba8c3a5880a42f1152c4386
		public static int displayQuestion(String question, String[] answers) {
			int answer = showOptionDialog(null, question, blurb, 0, PLAIN_MESSAGE, null, answers, null);
			return answer;
		}
    }


}
