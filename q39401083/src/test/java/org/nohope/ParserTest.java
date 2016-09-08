package org.nohope;

import com.fasterxml.jackson.core.type.TypeReference;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

;import static org.junit.Assert.assertEquals;

/**
 */
public class ParserTest {
    @Test
    public void testParser() {
        CharStream stream = new ANTLRInputStream("java.util.Map<java.util.List<java.lang.Integer>,java.util.Set<java.lang.String>>");
        TokenStream tokenStream = new CommonTokenStream(new ParametrizedTypeLexer(stream));

        ParametrizedTypeParser parser = new ParametrizedTypeParser(tokenStream);
        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());
        parser.setBuildParseTree(true);

        assertEquals(
                new TypeReference<Map<List<Integer>, Set<String>>>() {}.getType(),
                parser.type().value.build()
        );
    }
}
