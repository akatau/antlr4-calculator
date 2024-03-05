grammar SimpleArithmetic;

WS : [ \t\r\n]+ -> skip ;

// UnaryOperator: '!';

// BinaryOperator: '^' //#ExponentationOp
//               | '*' //#MultiplicationOp
//               | '/' //#DivisionOp
//               | '+' //#AdditionOp
//               | '-' //#SubtractionOp;
//               ;

IntegerNumber: [0-9]+;
RationalNumber: [0-9]+'.'[0-9]+;

// operand: IntegerNumber | RationalNumber;

Sign: '+' | '-';
operand: ('+'|'-')? (IntegerNumber|RationalNumber);


expression: '(' expression ')' #ParanthesisExpression
          | expression '!' #FactorialOp
          | expression '^' expression #ExponentiationOp
          | expression '*' expression #MultiplicationOp
          | expression '/' expression #DivisionOp
          | expression '+' expression #AdditionOp
          | expression '-' expression #SubtractionOp
          | operand #signedValue
          ;
