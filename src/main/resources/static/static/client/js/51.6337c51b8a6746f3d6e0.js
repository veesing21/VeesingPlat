webpackJsonp([51],{"EV//":function(e,t,i){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=i("mvHQ"),a=i.n(n),c=i("vLgD"),r={inject:["reload"],name:"common",data:function(){return{receipt:"",received:""}},created:function(){var e=this;Object(c.a)("sys/security/list",{pdType:4},"string").then(function(t){var i=JSON.parse(t);e.receipt=i["回执接收地址"],e.received=i["上行接收地址"]}).catch(function(e){})},methods:{onSubmit:function(){var e=this,t=[];t.push({id:e.receipt.id,value:e.receipt.value}),t.push({id:e.received.id,value:e.received.value}),Object(c.b)("sys/security/update",{json:a()(t)}).then(function(t){e.reload()}).catch(function(e){})}}},l={render:function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("div",{staticClass:"bgw p2"},[i("el-form",{staticStyle:{width:"80%",margin:"0 auto","margin-top":"40px"},attrs:{"label-width":"120px"}},[i("el-form-item",{attrs:{label:"回执接收地址"}},[i("el-input",{model:{value:e.receipt.value,callback:function(t){e.$set(e.receipt,"value",t)},expression:"receipt.value"}}),e._v(" "),i("p",{staticClass:"info"},[e._v("运营商回执产生后，实时将回执消息推送到设置的URL，不设置URL则不推送。\n      ")])],1),e._v(" "),i("el-form-item",{attrs:{label:"上行接收地址"}},[i("el-input",{model:{value:e.received.value,callback:function(t){e.$set(e.received,"value",t)},expression:"received.value"}}),e._v(" "),i("p",{staticClass:"info"},[e._v("用户回复短信后，实时将上行回复消息推送到设置的URL，不设置则不推送。")])],1),e._v(" "),i("el-form-item",[i("el-button",{attrs:{type:"primary"},on:{click:e.onSubmit}},[e._v("保存")]),e._v(" "),i("el-button",{on:{click:function(t){return e.reload()}}},[e._v("重置")])],1)],1)],1)},staticRenderFns:[]},u=i("VU/8")(r,l,!1,null,null,null);t.default=u.exports}});