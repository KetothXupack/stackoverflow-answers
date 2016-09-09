# type-parser-example

This is an example antlr4 parser for java parametrized types as an answer to http://stackoverflow.com/q/39401083/3239417

    CharStream stream =
        new ANTLRInputStream("java.util.Map<java.util.List<java.lang.Integer>,java.util.Set<java.lang.String>>");
    ParametrizedTypeParser parser =
        new ParametrizedTypeParser(new CommonTokenStream(new ParametrizedTypeLexer(stream)));

    Type parsedType = parser.type().value;
