package Application.utils.batch;

import org.springframework.batch.item.ItemProcessor;

public class BatchItemProcessor implements ItemProcessor<String, String> {

    //	@Override
    public String process(String data) throws Exception {
        return data.toUpperCase();
    }

}
