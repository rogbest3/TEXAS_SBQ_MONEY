"use strict"
var cus_info_chg = cus_info_chg || {}
cus_info_chg =(()=>{
	const WHEN_ERR = 'js파일을 찾지 못했습니다.'
	let _, js, main_vue_js
	let init =()=>{
		_ = $.ctx()
		js = $.js()
		main_vue_js = js + '/vue/main_vue.js'
	}
	
	let onCreate =()=>{
		init()
		$.when(
			$.getScript(main_vue_js)	
		)
		.done(()=>{
			setContentView()
		})
		.fail(()=>{
			alert(WHEN_ERR)
		})
	}
	
	let setContentView =()=>{
		$('#root div.mypage')
		.html(mypage_vue.cus_info_chg())
	}
	
	return { onCreate }
})()