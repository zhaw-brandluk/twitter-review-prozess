
package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Implementation des Service-Task Tweet-Senden
 * @author lukasbrandenberger
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

    /**
     * 
     * @param de            Objekt , welches Verknüasüdigh
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution de) throws Exception {
        String tweetContent = (String) de.getVariable("tweetContent");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!! Folgender Tweet wird veröffentlicht: " + tweetContent);
    }
    
}
