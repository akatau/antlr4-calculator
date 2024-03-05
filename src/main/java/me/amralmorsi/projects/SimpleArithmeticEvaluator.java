package me.amralmorsi.projects;

public class SimpleArithmeticEvaluator extends SimpleArithmeticBaseVisitor<Double> {
    @Override
    public Double visitParanthesisExpression(SimpleArithmeticParser.ParanthesisExpressionContext ctx){
        System.out.println(visit(ctx.expression()));
        return  visit(ctx.expression());
    }

    @Override
    public Double visitSignedValue (SimpleArithmeticParser.SignedValueContext ctx){
        System.out.println(ctx.operand().getText());
        return Double.parseDouble(ctx.operand().getText());
    }

    @Override 
    public Double visitFactorialOp (SimpleArithmeticParser.FactorialOpContext ctx){
        Double operand = visit(ctx.expression());
        for(Double i = operand; i>=1; i--){
            operand *= i;
        }
        return operand;
    }

    @Override
    public Double visitExponentiationOp(SimpleArithmeticParser.ExponentiationOpContext ctx){
        return Math.pow(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    public Double visitMultiplicationOp(SimpleArithmeticParser.MultiplicationOpContext ctx){
        return visit(ctx.expression(0)) * visit(ctx.expression(1));
    }
    
    public Double visitDivisionOp(SimpleArithmeticParser.DivisionOpContext ctx){
        return visit(ctx.expression(0)) / visit(ctx.expression(1));
    }

    public Double visitAdditionOp(SimpleArithmeticParser.AdditionOpContext ctx){
        return visit(ctx.expression(0)) + visit(ctx.expression(1));
    }

    public Double visitSubtractionOp(SimpleArithmeticParser.SubtractionOpContext ctx){
        return visit(ctx.expression(0)) - visit(ctx.expression(1));
    }

    
}
