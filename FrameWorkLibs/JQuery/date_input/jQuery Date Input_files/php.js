CodeHighlighter.addStyle("php",{
	comment : {
		exp  : /(\/\/[^\n]*\n)|(\#[^\n]*\n)|(\/\*[^*]*\*+([^\/][^*]*\*+)*\/)/
	},
	brackets : {
		exp  : /\(|\)/
	},
	string : {
		exp  : /'[^']*'|"[^"]*"/
	},
	keywords : {
		exp  : /\b(and|or|xor|__FILE__|exception|php_user_filter|__LINE__|array|as|break|case|cfunction|class|const|continue|declare|default|die|do|echo|else|elseif|empty|enddeclare|endfor|endforeach|endif|endswitch|endwhile|eval|exit|extends|for|foreach|function|global|if|include|include_once|isset|list|new|old_function|print|require|require_once|return|static|switch|unset|use|var|while|__FUNCTION__|__CLASS__|__METHOD__)\b/
	},
	variable : {
    exp  : /\$[a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*/
	}
});

