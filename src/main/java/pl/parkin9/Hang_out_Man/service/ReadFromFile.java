package pl.parkin9.Hang_out_Man.service;

import java.io.IOException;
import java.util.List;

public interface ReadFromFile {

    List<String> getContentFile() throws IOException;
}
