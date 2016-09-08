grammar ParametrizedType;

@parser::header {
    import org.nohope.ClassBuilder;
}

type returns[ClassBuilder value]
    : cls=CLASS          { $value = ClassBuilder.parse($cls.text); }
    | cls=CLASS          { $value = ClassBuilder.parse($cls.text); }
      LT head=type       { $value.add($head.value); }
        (COMMA tail=type { $value.add($tail.value); })* GT
    ;

GT  : '>'
    ;

LT  : '<'
    ;

COMMA
    : ','
    ;

CLASS
    : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'$'|'.'|'_')*
    ;
