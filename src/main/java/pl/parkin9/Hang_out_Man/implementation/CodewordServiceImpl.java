package pl.parkin9.Hang_out_Man.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.parkin9.Hang_out_Man.service.CodewordService;
import pl.parkin9.Hang_out_Man.service.ReadFromFile;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

 /*
 * The class draws the Codeword from the list of codewords.
 */

@Service
public class CodewordServiceImpl implements CodewordService {

    private final ReadFromFile readFromFile;

    @Autowired
    public CodewordServiceImpl(ReadFromFile readFromFile) {
        this.readFromFile = readFromFile;
    }

////////////////////////////////////////////////////////////////////

    @Override
    public String getRandCodeword() throws IOException {

        String codeword;

        List<String> codewordList = readFromFile.getContentFile();

        int randNum = ThreadLocalRandom.current().nextInt(codewordList.size() - 1);

        codeword = codewordList.get(randNum);

        return codeword;
    }
}
