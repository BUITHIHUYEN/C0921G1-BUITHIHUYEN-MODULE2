package bai_19_string_va_regex.bai_tap.validate_ten_lop_hoc;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static Pattern pattern ;
    private Matcher matcher;
    private static final String CLASS_REGEX="^[CAP]\\d{4}[GHIKLM]$";
    public ClassExample(){
        pattern = Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
