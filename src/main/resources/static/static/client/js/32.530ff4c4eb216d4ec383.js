webpackJsonp([32],{"4daM":function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=s("Pg0u"),a=s.n(i),n=s("vLgD"),c=s("X2Oc"),l={name:"index",props:["isSecondary"],data:function(){return{isIndex:!0,columnName:"",homePath:"",menuLists:"",thisPageName:"",customerInfo:"",dialogSafety:!1,form:{id:"",phone:"",code:"",verifycode:""},isDisabled:!1,isShowSafety:!0,balance:{1:{balance:0,sentCount:0},2:{balance:0,sentCount:0},3:{balance:0,sentCount:0},4:{balance:0,sentCount:0},5:{balance:0,sentCount:0},6:{balance:0,sentCount:0},7:{balance:0,sentCount:0}}}},created:function(){var t=this,e=Object(c.h)();t.customerInfo=e,t.form.id=e.id,t.form.phone=e.telephone;var s=window.sessionStorage.getItem("appKey");s&&(t.customerInfo.appKey=s,t.isShowSafety=!1)},mounted:function(){this.getSendData(0)},computed:{activePathFn:function(){return this.$route.matched.length>1?this.$route.matched[1].path:this.$route.path}},methods:{changeImg:function(){$("#imgObj").attr("src",this.changeUrl("/register/photocode"))},changeUrl:function(t){var e=(new Date).valueOf();return t.indexOf("?",t)>0&&(t=t.substring(0,t.indexOf(t,"?"))),t=t.indexOf("&")>=0?t+"×tamp="+e:t+"?timestamp="+e},windowOpen:function(t){window.open(t)},isOpen:function(t){return-1===t.indexOf("https")},getSendData:function(t){var e={getDay:t,pdType:1};if(0===t){var s=new Date,i=Object(c.e)(s,"yyyy-MM-dd");s.setDate(s.getDate()-1),e.starttime=i+" 00:00:00",e.endtime=i+" 23:59:59"}},navData:function(){var t=this;Object(c.i)().then(function(e){var s=t.$route.path;t.$route.matched.length>0&&(s=t.$route.matched[0].path),t.homePath=s;var i=e.filter(function(t){return s===t.attributes.url})[0];t.columnName=i.text,t.menuLists=i.children;var a=[];!function t(e){for(var s in e)a.push(e[s]),e[s].children&&t(e[s].children)}(i.children);var n=a.filter(function(e){return t.$route.path===e.attributes.url.split("?")[0]})[0];t.thisPageName=n.text}).catch(function(){})},formAppkey:function(){var t=this,e=t.form.verifycode;4!==e.length||isNaN(e)?t.R("验证码格式不正确"):Object(n.a)("customer/get/appKey",t.form).then(function(e){window.sessionStorage.setItem("appKey",e.msg),t.customerInfo.appKey=e.msg,t.dialogSafety=!1,t.isShowSafety=!1}).catch(function(){})},sendCode:function(){var t=this,e=t.form.code;e?(t.isDisabled=!0,Object(n.a)("common/vcode/send",{phone:t.form.phone,code:e}).then(function(e){0!=e.code&&t.changeImg()}).catch(function(){t.isDisabled=!1})):t.R("请输入图形验证码！")},drawChart:function(t,e,s){var i=a.a.init(document.getElementById("chart")),n={tooltip:{trigger:"axis"},grid:{left:"30px",right:"30px",bottom:"30px",top:"20px",containLabel:!0},xAxis:{boundaryGap:!1,data:t,splitLine:{show:!0,lineStyle:{type:"dashed"}}},yAxis:{splitLine:{lineStyle:{type:"dashed"}}},series:[{name:"发送总数",type:"line",itemStyle:{normal:{color:"#3C7BFF",lineStyle:{color:"#3C7BFF"}}},data:e},{name:"成功数量",type:"line",itemStyle:{normal:{color:"#FF9700",lineStyle:{color:"#FF9700"}}},data:s}]};i.setOption(n,!0),window.addEventListener("resize",function(){i.resize()})}},watch:{$route:{handler:function(t,e){var s=this;s.navData();var i=s.$route.path;s.$nextTick(function(){s.isIndex=s.homePath===i})},immediate:!0}}},o={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"iframe sms"},[s("el-container",{staticClass:"iframe-container"},[s("el-aside",{staticClass:"iframe-aside",attrs:{width:"140px"}},[s("div",{staticClass:"column-name"},[t._v(t._s(t.columnName))]),t._v(" "),s("el-menu",{staticClass:"noselect iframe-menu",attrs:{router:!0,"default-active":t.activePathFn}},[t._l(t.menuLists,function(e,i){return[e.children.length<1?s("el-menu-item",{key:i,attrs:{index:e.attributes.url,href:e.attributes.url}},[s("span",{attrs:{slot:"title"},slot:"title"},[t._v(t._s(e.text))])]):s("el-submenu",{attrs:{index:i.toString()}},[s("template",{slot:"title"},[s("span",[t._v(t._s(e.text))])]),t._v(" "),s("el-menu-item-group",[t._l(e.children,function(e,i){return t.isOpen(e.attributes.url)?s("el-menu-item",{key:i,attrs:{title:e.attributes.url,index:e.attributes.url}},[t._v(t._s(e.text)+"\n              ")]):t._e()}),t._v(" "),t._l(e.children,function(e,i){return t.isOpen(e.attributes.url)?t._e():s("el-menu-item",{key:i,attrs:{index:""},on:{click:function(s){return t.windowOpen(e.attributes.url)}}},[t._v(t._s(e.text)+"\n              ")])})],2)],2)]})],2)],1),t._v(" "),s("el-container",[s("el-header",{staticClass:"main-header",attrs:{height:"60px"}},[s("div",[s("div",[s("router-link",{attrs:{to:"/"}},[t._v("首页")]),t._v(" "),s("i",{staticClass:"iconfont iconsystem-moreb"}),t._v(" "),s("router-link",{attrs:{to:t.homePath}},[t._v(t._s(t.columnName))]),t._v(" "),s("i",{staticClass:"iconfont iconsystem-moreb"}),t._v(" "),s("span",[t._v(t._s(t.thisPageName))])],1)])]),t._v(" "),s("el-main",[s("div",{directives:[{name:"show",rawName:"v-show",value:t.isIndex,expression:"isIndex"}],staticClass:"sms-home"},[s("div",{staticClass:"item-1 c"},[s("div",{staticClass:"left fl p2"},[s("div",{staticClass:"account-info"},[s("span",[t._v(t._s(t.customerInfo.companyName))]),t._v(" "),0==t.customerInfo.status?s("p",{staticClass:"account-info-status"},[s("img",{attrs:{src:"/static/client/img/home/10.png"}}),t._v(" "),s("span",[t._v("企业资质审核未通过")])]):t._e(),t._v(" "),1==t.customerInfo.status?s("p",{staticClass:"account-info-status status-success"},[s("img",{attrs:{src:"/static/client/img/home/11.png"}}),t._v(" "),s("span",[t._v("企业认证通过")])]):t._e(),t._v(" "),2==t.customerInfo.status?s("p",{staticClass:"account-info-status"},[s("img",{attrs:{src:"/static/client/img/home/10.png"}}),t._v(" "),s("span",[t._v("企业资质审核中")])]):t._e(),t._v(" "),3==t.customerInfo.status?s("p",{staticClass:"account-info-status"},[s("img",{attrs:{src:"/static/client/img/home/10.png"}}),t._v(" "),s("span",[t._v("企业资质未认证")])]):t._e()]),t._v(" "),s("div",{staticClass:"c home"},[s("table",{staticClass:"account-info-business"},[s("tr",[s("td",[t._v("AppID：")]),t._v(" "),s("td",[t._v(t._s(t.customerInfo.appId))])])]),t._v(" "),s("ul",{staticClass:"fr c"},[s("li",{staticClass:"t-r"},[s("p",[t._v("已用")]),t._v(" "),s("p",[t._v(t._s(t.balance[1].sentCount))])]),t._v(" "),s("li",{staticClass:"t-r"},[s("p",[t._v("剩余")]),t._v(" "),s("p",[t._v(t._s(t.balance[1].balance))])]),t._v(" "),s("li",[s("p",[s("router-link",{attrs:{to:"/client/smscode/sent"}},[t._v("发送明细")])],1)])])])]),t._v(" "),s("div",{staticClass:"right fr"},[s("img",{attrs:{src:"/static/client/img/sms/1.png"}}),t._v(" "),s("div",[s("p",[t._v("云通信新用户 "),s("br"),t._v("专享首购折扣")]),t._v(" "),s("p",[t._v("全网最低价格，短信5折起购")])])])]),t._v(" "),t.isSecondary?s("el-card",{staticClass:"box-card mt2"},[s("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[s("span",[s("b",[t._v("接入流程")])])]),t._v(" "),s("div",{staticClass:"process"},[s("div",{staticClass:"el-steps el-steps--horizontal"},[s("div",{staticClass:"el-step is-horizontal",staticStyle:{"flex-basis":"50%","margin-right":"0px"}},[s("div",{staticClass:"el-step__head"},[s("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[s("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"0ms","border-width":"0px",width:"0%"}})]),t._v(" "),s("div",{staticClass:"el-step__icon"},[s("img",{attrs:{src:"/static/client/img/sms/2.png"}}),t._v(" "),s("div",[t._v("1.配置模板")])])]),t._v(" "),s("div",{staticClass:"el-step__main"},[s("div",{staticClass:"el-step__title"},[s("router-link",{staticClass:"color",attrs:{to:"/client/smscode/template"}},[t._v("去配置")])],1),t._v(" "),s("div",{staticClass:"el-step__description"})])]),t._v(" "),s("div",{staticClass:"el-step is-horizontal",staticStyle:{"flex-basis":"50%","margin-right":"0px"}},[s("div",{staticClass:"el-step__head"},[s("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[s("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"-150ms","border-width":"0px",width:"0%"}})]),t._v(" "),s("div",{staticClass:"el-step__icon"},[s("img",{attrs:{src:"/static/client/img/sms/3.png"}}),t._v(" "),s("div",[t._v("2.接口调用")])])]),t._v(" "),s("div",{staticClass:"el-step__main"},[s("div",{staticClass:"el-step__title"},[s("a",{staticClass:"color",attrs:{target:"_blank",href:"https://www.10658.com.cn/doc/58"}},[t._v("阅读文档")])]),t._v(" "),s("div",{staticClass:"el-step__description"})])]),t._v(" "),s("div",{staticClass:"el-step is-horizontal is-flex",staticStyle:{"flex-basis":"50%","max-width":"33.3333%"}},[s("div",{staticClass:"el-step__head"},[s("div",{staticClass:"el-step__line"},[s("i",{staticClass:"el-step__line-inner"})]),t._v(" "),s("div",{staticClass:"el-step__icon"},[s("img",{attrs:{src:"/static/client/img/sms/4.png"}}),t._v(" "),s("div",[t._v("3.产品充值")])])]),t._v(" "),s("div",{staticClass:"el-step__main"},[s("div",{staticClass:"el-step__description"})])])])])]):t._e(),t._v(" "),s("el-card",{staticClass:"box-card mt2"},[s("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[s("span",[s("b",[t._v("短信验证码使用统计")])])]),t._v(" "),s("div",{staticClass:"statistics c"},[s("div",{staticClass:"grid-content",staticStyle:{"padding-top":"20px"}},[s("div",{attrs:{id:"chart"}})]),t._v(" "),s("div",{staticClass:"grid-content",staticStyle:{"padding-top":"40px"}},[s("el-button-group",[s("el-button",{on:{click:function(e){return t.getSendData(0)}}},[t._v("本日")]),t._v(" "),s("el-button",{on:{click:function(e){return t.getSendData(7)}}},[t._v("本周")]),t._v(" "),s("el-button",{on:{click:function(e){return t.getSendData(30)}}},[t._v("本月")]),t._v(" "),s("el-button",{on:{click:function(e){return t.getSendData(365)}}},[t._v("本年")])],1),t._v(" "),s("div",{staticClass:"legend"},[s("p",[t._v("发送总数")]),t._v(" "),s("p",[t._v("成功数量")])])],1)])])],1),t._v(" "),t.isIndex?t._e():s("router-view",{attrs:{isSecondary:t.isSecondary}})],1)],1)],1),t._v(" "),s("transition",{attrs:{name:"dialog-fade"}},[s("div",{directives:[{name:"show",rawName:"v-show",value:t.dialogSafety,expression:"dialogSafety"}],staticClass:"dialog dialog-min"},[s("div",{staticClass:"dialog-body"},[s("div",{staticClass:"dialog-header"},[t._v("\n          安全验证 "),s("i",{staticClass:"fr iconfont iconsystem-cancel-bold",on:{click:function(e){t.dialogSafety=!1}}})]),t._v(" "),s("div",{staticClass:"dialog-content c p2"},[s("el-alert",{attrs:{title:"您正在进行敏感操作，为确保您的安全，需验证您的身份，通过验证后方可操作。",type:"warning","show-icon":"",closable:!1}}),t._v(" "),s("el-form",{staticStyle:{width:"400px",margin:"0 auto","margin-top":"20px"},attrs:{"label-width":"80px"}},[s("el-form-item",{attrs:{label:"手机号："}},[s("el-input",{attrs:{value:t.form.phone,disabled:!0}})],1),t._v(" "),s("el-form-item",{attrs:{label:"验证码："}},[s("el-input",{staticStyle:{width:"160px"},attrs:{maxlength:"4"},model:{value:t.form.code,callback:function(e){t.$set(t.form,"code","string"==typeof e?e.trim():e)},expression:"form.code"}}),t._v(" "),s("img",{staticClass:"cp",staticStyle:{"vertical-align":"top"},attrs:{id:"imgObj",alt:"验证码",src:"/register/photocode"},on:{click:function(e){return t.changeImg()}}}),t._v(" "),s("a",{staticClass:"cp",on:{click:function(e){return t.changeImg()}}},[t._v("换一张")])],1),t._v(" "),s("el-form-item",{attrs:{label:"验证码："}},[s("el-input",{staticStyle:{width:"200px"},attrs:{maxlength:"4"},model:{value:t.form.verifycode,callback:function(e){t.$set(t.form,"verifycode","string"==typeof e?e.trim():e)},expression:"form.verifycode"}}),t._v(" "),s("el-button",{staticStyle:{padding:"11px 20px"},attrs:{type:"primary",disabled:t.isDisabled},on:{click:function(e){return e.preventDefault(),t.sendCode()}}},[t._v("发送验证码\n              ")])],1)],1)],1),t._v(" "),s("div",{staticClass:"dialog-footer c p2"},[s("div",{staticClass:"fr"},[s("el-button",{attrs:{type:"primary"},on:{click:t.formAppkey}},[t._v("确定")]),t._v(" "),s("el-button",{on:{click:function(e){t.dialogSafety=!1}}},[t._v("取消")])],1)])])])])],1)},staticRenderFns:[]},r=s("VU/8")(l,o,!1,null,null,null);e.default=r.exports}});