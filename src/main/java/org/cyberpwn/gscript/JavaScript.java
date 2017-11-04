package org.cyberpwn.gscript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Evaluates an expression using javascript engine and returns the double
 * result. This can take variable parameters, so you need to define them.
 * Parameters are defined as $[0-9]. For example evaluate("4$0/$1", 1, 2); This
 * makes the expression (4x1)/2 == 2. Keep note that you must use 0-9, you
 * cannot skip, or start at a number other than 0.
 *
 * @author cyberpwn
 */
@SuppressWarnings("restriction")
public class JavaScript
{
	public String evaluate(String expression) throws IndexOutOfBoundsException, ScriptException
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine scriptEngine = mgr.getEngineByName("JavaScript");

		return scriptEngine.eval(expression).toString();
	}
}
