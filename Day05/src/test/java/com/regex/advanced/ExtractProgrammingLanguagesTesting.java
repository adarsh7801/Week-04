package com.regex.advanced;

import com.regex.advanced.ExtractProgrammingLanguages;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtractProgrammingLanguagesTesting {

    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages = ExtractProgrammingLanguages.extractLanguages(text);
        assertArrayEquals(new String[]{"Java", "Python", "JavaScript", "Go"}, languages);
    }

    @Test
    void testNoLanguages() {
        String text = "This sentence has no programming languages mentioned.";
        String[] languages = ExtractProgrammingLanguages.extractLanguages(text);
        assertEquals(0, languages.length);
    }

    @Test
    void testMixedCaseLanguages() {
        String text = "I have worked with JAVA, python, and JaVaScRiPt.";
        String[] languages = ExtractProgrammingLanguages.extractLanguages(text);
        assertArrayEquals(new String[]{"JAVA", "python", "JaVaScRiPt"}, languages);
    }
}
