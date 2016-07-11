RUBY_VARIABLE_CHARS = "[a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*"
CodeHighlighter.addStyle("ruby",{
	comment : {
		exp  : /#[^\n]+/
	},
	brackets : {
		exp  : /\(|\)/
	},
	string : {
		exp  : /'[^']*'|"[^"]*"/
	},
	keywords : {
		exp  : /\b(do|end|self|class|def|if|module|yield|then|else|for|until|unless|while|elsif|case|when|break|retry|redo|rescue|require|raise)\b/
	},
	global_variable : {
    exp  : new RegExp('\\$' + RUBY_VARIABLE_CHARS)
	},
	instance_variable : {
    exp  : new RegExp('@' + RUBY_VARIABLE_CHARS)
	},
	class_variable : {
    exp  : new RegExp('@@' + RUBY_VARIABLE_CHARS)
	},
	symbol : {
	  exp  : /\:(@{1,2}|\$)?[a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*/
	}
});
