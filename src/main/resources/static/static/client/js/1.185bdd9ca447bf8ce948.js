webpackJsonp([1],{"+66z":function(t,e){var i=Object.prototype.toString;t.exports=function(t){return i.call(t)}},"6MiT":function(t,e,i){var s=i("aCM0"),a=i("UnEC"),n="[object Symbol]";t.exports=function(t){return"symbol"==typeof t||a(t)&&s(t)==n}},"AY+2":function(t,e,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s=i("mvHQ"),a=i.n(s),n=i("vLgD"),c=i("X2Oc"),l=i("O4Lo"),o=i.n(l),r=i("RAp7"),p=i("C6AZ"),v={name:"tpl",mixins:[r.a],data:function(){return{noTime:!0,sort:Object(p.a)(),total:0,lists:[],userType:"",pageSizes:[8,12,16,20],listQuery:{page:1,limit:8,offset:0,mmsType:1,pdType:7}}},created:function(){this.userType=Object(c.h)().customerType,this.getList()},methods:{useTpl:function(t){this.$emit("useTpl",t)},edit:function(t){this.$emit("editMms",t)},preview:function(t){this.$emit("preview",t)},delMms:function(t){var e=this;e.$confirm("您确定要删除吗？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(n.a)("mms/group/deleteMmsTemplate",{id:t.id}).then(function(t){e.getList()}).catch(function(){})}).catch(function(){})},mmsSort:function(t,e){for(var i=this,s=i.sort.length,a=0;a<s;a++)a==e?i.sort[e].active=!0:i.sort[a].active=!1;i.listQuery.mmsType=0==t?1:t,i.getList(!0)},getList:function(t){var e=this;t&&(e.listQuery.page=1,e.listQuery.offset=0),e.listQuery.offset=(e.listQuery.page-1)*e.listQuery.limit,Object(n.a)("mms/group/listMmsTemplate",e.listQuery).then(function(t){for(var i=t.rows,s=i.length,a=0;a<s;a++){var n=i[a].frameJson;if(n){var c=JSON.parse(n);if(c){var l=c[0].mediaPath||"";!l&&c.length>1&&(l=c[1].mediaPath||""),i[a].packageName=l.split(".")[1]||"",i[a].content=l}}}e.lists=i,e.total=t.total}).catch(function(t){console.log(t)})}}},m={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"mms-sort"},[i("div",[i("table",[i("tr",[t._m(0),t._v(" "),i("td",t._l(t.sort,function(e,s){return 20!=e.mmsType||0==t.userType?i("a",{class:{active:e.active},on:{click:function(i){return t.mmsSort(e.mmsType,s)}}},[t._v(t._s(e.name))]):t._e()}),0)])]),t._v(" "),i("section",{staticClass:"mms-section c"},t._l(t.lists,function(e,s){return i("div",{staticClass:"mms-card"},[i("div",{staticClass:"card-content"},[i("div",{staticClass:"figure"},[i("img",{attrs:{src:"/static/client/img/mms/figure.png",alt:"figure"}}),t._v(" "),e.content?i("div",{staticClass:"ab"},["mp4"==e.packageName?i("video",{attrs:{width:"100%",controls:"",src:e.content}}):"mp3"==e.packageName?i("audio",{attrs:{width:"100%",controls:"",src:e.content}}):i("img",{attrs:{src:e.content}})]):t._e(),t._v(" "),i("div",{staticClass:"mms-show-id"},[t._v("模板ID："+t._s(e.id))])]),t._v(" "),i("div",{staticClass:"use-mms-tpl"},[i("span",{on:{click:function(i){return t.useTpl(e)}}},[t._v("立即使用")])]),t._v(" "),i("p",{staticClass:"title",attrs:{title:e.title}},[t._v("\n              "+t._s(e.title)+"\n            ")]),t._v(" "),i("div",{staticClass:"p1"},[i("span",{staticClass:"cp color",on:{click:function(i){return t.preview(e)}}},[t._v("预览")]),t._v(" "),1==e.mmsType||0==t.userType?i("span",{staticClass:"fr cp",on:{click:function(i){return t.delMms(e)}}},[i("i",{staticClass:"el-icon-delete-solid info"})]):t._e()])])])}),0)]),t._v(" "),i("div",{staticClass:"pagination-container"},[i("el-pagination",{attrs:{"current-page":t.listQuery.page,"page-size":t.listQuery.limit,"page-sizes":t.pageSizes,total:t.total,background:"",layout:"total, prev, pager, next, sizes, jumper"},on:{"current-change":t.handleCurrentChange,"size-change":t.handleSizeChange}})],1)])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("td",{staticStyle:{"vertical-align":"top"},attrs:{width:"50"}},[e("span",[this._v("分类：")])])}]},d={inject:["reload"],name:"group",components:{"select-tpl":i("VU/8")(v,m,!1,null,null,null).exports,"input-phones":i("mBRr").a},data:function(){return{stepsActive:0,activeName:"group",title:"",mmsId:"",size:0,frameJson:[{txt:"",photopath:"",videopath:"",voicepath:"",mediaPath:"",kb:{media:0,font:0},time:2}],index:-1,maxSize:2048e3,mmsTypeLists:Object(p.a)(),mmsType:1,item:"",previewTitle:"",dialogPreview:!1,sentInfo:"",createTime:"",customer:""}},created:function(){this.customer=Object(c.h)()},methods:{urge:function(){this.R("客服会尽快为您处理！请耐心等待。")},sent:function(t){var e=this,i={title:e.title,frameJson:a()(e.frameJson),size:e.size,pdType:7,mmsId:e.mmsId},s=e.sentInfo,l=s.phones;if(l){if(i.phones=l,2==s.sentType){if(!s.sendTime)return void e.R("请选择定时时间！");i.jobTime=Object(c.e)(s.sendTime)}t&&(i.holdOn="holdOn"),Object(n.b)("mms/group/submit",i).then(function(t){e.stepsActive=2}).catch(function(){})}else e.R("收件人不能为空！")},sentData:function(t){this.sentInfo=t},formatDate:function(t){return t?Object(c.e)(t):""},useTpl:function(t){var e=this;e.mmsId=t.id,e.title=t.title,e.size=t.size,e.frameJson=Object(c.f)(JSON.parse(t.frameJson)),e.createTime=Object(c.e)(new Date),e.stepsActive=1},preview:function(t){var e=this;t?(e.item=Object(c.f)(JSON.parse(t.frameJson)),e.previewTitle=t.title):(e.item=e.frameJson,e.previewTitle=e.title),e.dialogPreview=!0,e.$nextTick(function(){$(".slide").scrollTop(0)})},editMms:function(t){var e=this;1===t.mmsType&&(e.mmsId=t.id),0===e.customer.customerType&&(e.mmsId=t.id,e.mmsType=t.mmsType),e.title=t.title,e.size=t.size,e.frameJson=Object(c.f)(JSON.parse(t.frameJson)),e.activeName="group"},nextStep:function(){var t=this;if(t.title){for(var e=t.frameJson,i=e.length,s=0;s<i;s++){if(!(e[s].txt||e[s].mediaPath))return void t.R("不能保存空的帧！")}var l={frameJson:a()(e),title:t.title,size:t.size,mmsType:t.mmsType,pdType:7};Object(n.b)("mms/group/handleMmsTemplate",l).then(function(e){t.mmsId=e.id,t.createTime=Object(c.e)(new Date),t.stepsActive=1}).catch(function(){})}else t.R("请填写彩信标题")},addMms:function(){var t=this,e=t.frameJson.length-1;t.frameJson[e].txt||t.frameJson[e].mediaPath?t.frameJson>t.maxSize/1e3?t.R("彩信总大小超出限制！"):t.frameJson.push({txt:"",photopath:"",videopath:"",voicepath:"",mediaPath:"",kb:{media:0,font:0},time:2}):t.R("请先编辑内容在创建新的帧！")},removeMedia:function(t){var e=this;e.$confirm("您确定要删除文件吗?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){e.frameJson[t].photopath="",e.frameJson[t].videopath="",e.frameJson[t].voicepath="",e.frameJson[t].mediaPath="",e.frameJson[t].kb.media=0}).catch(function(){})},removeZhen:function(t){var e=this;e.frameJson.length<2?e.R("最后一帧不能删除！"):e.$confirm("您确定要删除此帧吗?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){e.frameJson.splice(t,1)}).catch(function(){})},sizeof:function(t,e){var i,s,a,n=0;if("utf-16"===(e=e?e.toLowerCase():"")||"utf16"===e)for(s=0,a=t.length;s<a;s++)n+=(i=t.charCodeAt(s))<=65535?2:4;else for(s=0,a=t.length;s<a;s++)n+=(i=t.charCodeAt(s))<=127?1:i<=2047?2:i<=65535?3:4;return n},fontSizes:function(t,e){var i=this.sizeof(e)/1e3;this.frameJson[t].kb.font=Math.ceil(i)},upload:function(t,e){var i=this,s=this;if(1==s.customer.status){s.index=e;var a=s.frameJson[e].photopath,n=s.frameJson[e].videopath,c=s.frameJson[e].voicepath;if("i"==t){if(n||c)return void l();$("#photo").click()}if("v"==t){if(a||c)return void l();$("#mp4").click()}if("m"==t){if(a||n)return void l();$("#mp3").click()}}else this.$confirm("请先进行 企业资质认证","提示",{confirmButtonText:"立即认证",cancelButtonText:"取消",type:"warning"}).then(function(){i.$router.push({name:"SysAccount"})}).catch(function(){});function l(){s.R("每帧不能同时添加视频，音频和图片")}},uploadFile:function(t){var e=this,i=$(t)[0].files[0],s=i.size,a=i.type;if(!/.(gif|jpeg|jpg|mp4|mp3)$/.test(a)||s>e.maxSize)return e.R("文件格式不正确或大小超出限制"),void $(t).val("");var c=new FormData;c.append("file",i),Object(n.c)(c).then(function(i){$(t).val(""),"#photo"==t&&(e.frameJson[e.index].photopath=i.fileName),"#mp4"==t&&(e.frameJson[e.index].videopath=i.fileName),"#mp3"==t&&(e.frameJson[e.index].voicepath=i.fileName),e.frameJson[e.index].mediaPath=i.fileName,e.frameJson[e.index].kb.media=(s/1e3).toFixed(2)}).catch(function(){})},mmsSize:o()(function(){for(var t=this,e=t.frameJson.length,i=0,s=0;s<e;s++){var a=t.frameJson[s].kb.media,n=t.frameJson[s].kb.font,c=t.accAdd(a,n);i=t.accAdd(i,c)}t.size=Math.ceil(i)},300),inpText:function(t){$(".online-mms dd textarea").eq(t).focus()},accTime:function(){var t=this;$(".online-mms .dd").each(function(e){var i=$(this).attr("s");t.frameJson[e].time=i})},clertMmsConent:function(){var t=this;t.mmsId=0,t.title="",t.size=0,t.frameJson=[{txt:"",photopath:"",videopath:"",voicepath:"",mediaPath:"",kb:{media:0,font:0},time:2}],t.mmsType=1,t.screenshot=""},small_down:function(t){var e=this,i=$(".active #small")[0],s=$(".active .scale").width();t=t||window.event;return i.startX=t.clientX-(i.offsetLeft+11),document.onmousemove=function(t){var e=(t=t||window.event).clientX-i.startX;$(".active .hand").width(e),e<0&&$(".active .hand").width(0),e>s&&$(".active .hand").width(s)},document.onmouseup=function(){var t=$(".active .play-length .scale span").width()-1,i=$(".active .hand").width(),s=Math.round(i/t);s<1&&(s=1),s>15&&(s=15),$(".active .hand").animate({width:t*s},100).attr("s",s),$(".online-mms dd.active").attr("s",s),e.accTime(),document.onmousemove=null,document.onmouseup=null},!1},accAdd:function(t,e){return Object(c.b)(t,e)},accMul:function(t,e){return Object(c.c)(t,e)}},watch:{frameJson:{handler:function(){this.mmsSize()},deep:!0}},mounted:function(){$(".online-mms").on("mouseenter",".dd",function(){$(this).is(".active")||($(".online-mms .dd").removeClass("active"),$(this).addClass("active"),$(".online-mms .play-length").hide())}),$(".online-mms").on("click",".add-play",function(){var t=$(".online-mms .active .play-length");t.is(":hidden")?t.show():t.hide();var e,i,s,a=$(".online-mms .active").attr("s");e=a,i=$(".active .play-length .scale span").width()-1,s=Object(c.c)(i,e),$(".hand").animate({width:s},100)})}},u={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"mms-group"},[i("el-card",{staticClass:"box-card"},[i("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[i("span",[i("b",[t._v("使用流程")])])]),t._v(" "),i("div",{staticClass:"steps"},[i("div",{staticClass:"el-steps el-steps--horizontal"},[i("div",{staticClass:"el-step is-horizontal",staticStyle:{"flex-basis":"50%","margin-right":"0px"}},[i("div",{staticClass:"el-step__head is-process"},[i("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[i("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"0ms","border-width":"0px",width:"0%"}})]),t._v(" "),i("div",{staticClass:"el-step__icon"},[i("div",{staticClass:"el-step__icon__img"},[i("img",{attrs:{src:"/static/client/img/mms/1.png"}})]),t._v(" "),i("div",[t._v("1.创建彩信内容")])])])]),t._v(" "),i("div",{staticClass:"el-step is-horizontal",staticStyle:{"flex-basis":"50%","margin-right":"0px"}},[i("div",{staticClass:"el-step__head",class:[t.stepsActive>0?"is-process":"is-wait"]},[i("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[i("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"-150ms","border-width":"0px",width:"0%"}})]),t._v(" "),i("div",{staticClass:"el-step__icon"},[i("div",{staticClass:"el-step__icon__img"},[t.stepsActive>0?i("img",{attrs:{src:"/static/client/img/mms/4.png"}}):i("img",{attrs:{src:"/static/client/img/mms/2.png"}})]),t._v(" "),i("div",[t._v("2.录入发送号码")])])])]),t._v(" "),i("div",{staticClass:"el-step is-horizontal is-flex",staticStyle:{"flex-basis":"50%","max-width":"33.3333%"}},[i("div",{staticClass:"el-step__head",class:[t.stepsActive>1?"is-process":"is-wait"]},[i("div",{staticClass:"el-step__line"},[i("i",{staticClass:"el-step__line-inner"})]),t._v(" "),i("div",{staticClass:"el-step__icon"},[i("div",{staticClass:"el-step__icon__img"},[t.stepsActive>1?i("img",{attrs:{src:"/static/client/img/mms/5.png"}}):i("img",{attrs:{src:"/static/client/img/mms/3.png"}})]),t._v(" "),i("div",[t._v("3.提交发送")])])])])])])]),t._v(" "),i("el-card",{directives:[{name:"show",rawName:"v-show",value:0===t.stepsActive,expression:"stepsActive === 0"}],staticClass:"box-card mt2"},[i("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[i("span",[i("b",[t._v("彩信标题")]),t._v(" "),i("el-tooltip",{attrs:{effect:"dark",content:"彩信标题不能包含特殊符号",placement:"top"}},[i("i",{staticClass:"iconfont iconquestion-circle cp",staticStyle:{"font-size":"18px"}})])],1)]),t._v(" "),i("div",{staticClass:"mms-title"},[i("el-input",{attrs:{type:"text",size:"medium",placeholder:"请输入彩信标题",maxlength:"30","show-word-limit":""},model:{value:t.title,callback:function(e){t.title="string"==typeof e?e.trim():e},expression:"title"}})],1)]),t._v(" "),i("div",{directives:[{name:"show",rawName:"v-show",value:0===t.stepsActive,expression:"stepsActive === 0"}],staticStyle:{"box-shadow":"0px 0px 23px 0px rgba(0,0,0,0.05)"}},[i("el-tabs",{staticClass:"mms-group-content mt2",attrs:{type:"border-card"},model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},[i("el-tab-pane",{attrs:{name:"group"}},[i("p",{staticClass:"mms-size",attrs:{slot:"label"},slot:"label"},[t._v("\n          在线制作"),i("span",[t._v("（"),i("font",{class:{error:t.size>t.maxSize/1e3}},[t._v(t._s(t.size)+"K")]),t._v("/"+t._s(t.maxSize/1e3)+"K）")],1)]),t._v(" "),i("div",{staticClass:"online-mms"},[i("dl",{staticClass:"c"},[t._l(t.frameJson,function(e,s){return i("dd",{staticClass:"dd",class:{active:0==s},attrs:{s:e.time}},[i("p",[t._v("第\n                "),i("font",[t._v(t._s(s+1))]),t._v("\n                帧"),i("span",[t._v("（"),i("font",[t._v(t._s(Math.round(t.accAdd(e.kb.media,e.kb.font))))]),t._v("k）")],1)],1),t._v(" "),i("div",{staticClass:"top"},[i("div",{staticClass:"media",class:{bgn:e.photopath,bgn1:e.videopath,bgn2:e.voicepath}},[e.photopath?i("div",[i("img",{attrs:{src:e.photopath,kb:e.kb.media}}),t._v(" "),i("i",{staticClass:"remove-media",attrs:{title:"删除文件"},on:{click:function(e){return t.removeMedia(s)}}})]):e.videopath?i("div",[i("video",{attrs:{src:e.videopath,controls:"",kb:e.kb.media}}),t._v(" "),i("i",{staticClass:"remove-media",attrs:{title:"删除文件"},on:{click:function(e){return t.removeMedia(s)}}})]):e.voicepath?i("div",[i("audio",{attrs:{src:e.voicepath,controls:"",kb:e.kb.media}}),t._v(" "),i("i",{staticClass:"remove-media",attrs:{title:"删除文件"},on:{click:function(e){return t.removeMedia(s)}}})]):i("div",{staticClass:"w100"},[i("ul",{staticClass:"c"},[i("li",{attrs:{title:"点击添加图片"},on:{click:function(e){return t.upload("i",s)}}},[i("img",{staticClass:"avi",attrs:{src:"/static/client/img/mms/img.png"}}),t._v(" "),i("p",[t._v("添加图片")])]),t._v(" "),i("li",{attrs:{title:"点击添加视频"},on:{click:function(e){return t.upload("v",s)}}},[i("img",{staticClass:"avi",attrs:{src:"/static/client/img/mms/video.png"}}),t._v(" "),i("p",[t._v("添加视频")])]),t._v(" "),i("li",{attrs:{title:"点击添加音频"},on:{click:function(e){return t.upload("m",s)}}},[i("img",{staticClass:"avi",attrs:{src:"/static/client/img/mms/audio.png"}}),t._v(" "),i("p",[t._v("添加音频")])])]),t._v(" "),i("p",{staticClass:"t-c",staticStyle:{"line-height":"24px"}},[t._v("\n                      点击将文件上传 "),i("br"),t._v(" "),i("span",{staticClass:"info"},[t._v("支持扩展名：.jpg .gif .mp3 .mp4")])])])]),t._v(" "),i("div",{staticClass:"text"},[i("textarea",{directives:[{name:"model",rawName:"v-model",value:e.txt,expression:"item.txt"}],staticClass:"el-textarea__inner",attrs:{kb:e.kb.font,placeholder:"请输入内容"},domProps:{value:e.txt,textContent:t._s(e.text)},on:{input:[function(i){i.target.composing||t.$set(e,"txt",i.target.value)},function(i){return t.fontSizes(s,e.txt)}]}})])]),t._v(" "),i("div",{staticClass:"mms-edit-btn"},[i("button",{staticClass:"add-font",attrs:{title:"添加文字",type:"button"},on:{click:function(e){return t.inpText(s)}}},[i("img",{attrs:{src:"/static/client/img/mms/icon-1.png"}})]),t._v(" "),i("button",{staticClass:"add-photo",attrs:{title:"添加图片",type:"button"},on:{click:function(e){return t.upload("i",s)}}},[i("img",{attrs:{src:"/static/client/img/mms/icon-2.png"}})]),t._v(" "),i("button",{staticClass:"add-film",attrs:{title:"添加视频",type:"button"},on:{click:function(e){return t.upload("v",s)}}},[i("img",{attrs:{src:"/static/client/img/mms/icon-3.png"}})]),t._v(" "),i("button",{staticClass:"add-music",attrs:{title:"添加音乐",type:"button"},on:{click:function(e){return t.upload("m",s)}}},[i("img",{attrs:{src:"/static/client/img/mms/icon-4.png"}})]),t._v(" "),i("button",{staticClass:"add-play",attrs:{title:"设置时间",type:"button"}},[i("img",{attrs:{src:"/static/client/img/mms/icon-5.png"}})]),t._v(" "),i("button",{staticClass:"remove-zhen",attrs:{title:"删除此帧",type:"button"},on:{click:function(e){return t.removeZhen(s)}}},[i("img",{attrs:{src:"/static/client/img/mms/icon-6.png"}})])]),t._v(" "),i("div",{staticClass:"play-length c"},[i("div",{staticClass:"progress"}),t._v(" "),i("div",{staticClass:"scale",attrs:{id:"big"}},[i("div",{staticClass:"c"},[i("span",[i("i",[t._v("0")])]),i("span",[i("i")]),i("span",[i("i")]),i("span",[i("i")]),t._v(" "),i("span",[i("i")]),t._v(" "),i("span",[i("i",[t._v("5")])]),i("span",[i("i")]),t._v(" "),i("span",[i("i")]),t._v(" "),i("span",[i("i")]),i("span",[i("i")]),t._v(" "),i("span",[i("i",[t._v("10")])]),t._v(" "),i("span",[i("i")]),i("span",[i("i")]),t._v(" "),i("span",[i("i")]),t._v(" "),i("span",[i("i")]),t._v(" "),i("span",[i("i",[t._v("15")])])]),t._v(" "),i("div",{staticClass:"hand",attrs:{s:e.time}},[i("i",{attrs:{id:"small"},on:{mousedown:function(e){return t.small_down(t.event)}}})])]),t._v(" "),i("span",[t._v("秒")])])])}),t._v(" "),i("dd",{staticClass:"add-zhen",attrs:{title:"添加新彩信帧"},on:{click:function(e){return t.addMms()}}},[i("p",[t._v("添加")]),t._v(" "),i("div",{staticClass:"hover top"},[i("div",{staticClass:"media"}),t._v(" "),i("div",{staticClass:"text"},[i("textarea",{staticClass:"layui-textarea",staticStyle:{border:"none"},attrs:{disabled:""}})])]),t._v(" "),i("i")])],2),t._v(" "),i("input",{staticClass:"hide",attrs:{id:"photo",accept:".jpg,.gif,.jpeg",type:"file"},on:{change:function(e){return t.uploadFile("#photo")}}}),t._v(" "),i("input",{staticClass:"hide",attrs:{id:"mp4",accept:".mp4",type:"file"},on:{change:function(e){return t.uploadFile("#mp4")}}}),t._v(" "),i("input",{staticClass:"hide",attrs:{id:"mp3",accept:".mp3",type:"file"},on:{change:function(e){return t.uploadFile("#mp3")}}})])]),t._v(" "),i("el-tab-pane",{attrs:{name:"tpl",label:"模板库"}},[i("div",{staticClass:"mms-tpl-list p2"},["tpl"===t.activeName?i("select-tpl",{on:{editMms:t.editMms,preview:t.preview,useTpl:t.useTpl}}):t._e()],1)])],1)],1),t._v(" "),1===t.stepsActive?i("div",[i("el-card",{staticClass:"box-card mt2"},[i("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[i("span",[i("b",[t._v("录入号码")])])]),t._v(" "),i("input-phones",{attrs:{frameJson:t.frameJson,title:t.title},on:{sentData:t.sentData}})],1)],1):t._e(),t._v(" "),2===t.stepsActive?i("div",[i("el-card",{staticClass:"box-card mt2"},[i("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[i("span",[i("b",[t._v("提交发送")])])]),t._v(" "),i("div",{staticClass:"sent-success"},[i("div",{staticClass:"t-c"},[i("img",{attrs:{src:"/static/client/img/success.png",alt:"提交成功"}}),t._v(" "),i("p",[i("b",[t._v("提交成功")])]),t._v(" "),i("p",{staticClass:"info"},[t._v("彩信提交成功，平台正在进行内容合规检测，下发结果稍后反馈 ，请耐心等待")])]),t._v(" "),i("div",{staticClass:"sent-success-info"},[i("div",{staticClass:"info-table c"},[i("p",[i("span",[t._v("彩信标题：")]),t._v(t._s(t.title))]),t._v(" "),i("p",[i("span",[t._v("彩信ID：")]),t._v(t._s(t.mmsId))]),t._v(" "),2==t.sentInfo.sentType&&t.sentInfo.sendTime?i("p",[i("span",[t._v("定时时间：")]),t._v(t._s(t.formatDate(t.sentInfo.sendTime)))]):t._e(),t._v(" "),t.sentInfo.phones?i("p",[i("span",[t._v("发送号码量：")]),t._v(t._s(t.sentInfo.phones.split(",").length))]):t._e()]),t._v(" "),i("div",{staticClass:"el-steps el-steps--horizontal",staticStyle:{"margin-top":"50px"}},[i("div",{staticClass:"el-step is-horizontal is-center",staticStyle:{"flex-basis":"25%","margin-right":"0px"}},[i("div",{staticClass:"el-step__head is-finish"},[i("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[i("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"0ms","border-width":"0px",width:"0%"}})]),t._v(" "),i("div",{staticClass:"el-step__icon is-text"},[i("div",{staticClass:"el-step__icon-inner"},[t._v("1")])]),t._v("\n                创建彩信\n              ")]),t._v(" "),i("div",{staticClass:"el-step__main"},[i("div",{staticClass:"mt2 info"},[t._v("\n                  "+t._s(t.createTime)+"\n                ")])])]),t._v(" "),i("div",{staticClass:"el-step is-horizontal is-center",staticStyle:{"flex-basis":"25%","margin-right":"0px"}},[i("div",{staticClass:"el-step__head is-process"},[i("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[i("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"-150ms","border-width":"0px",width:"0%"}})]),t._v(" "),i("div",{staticClass:"el-step__icon is-text"},[i("div",{staticClass:"el-step__icon-inner"},[t._v("2")])]),t._v("\n                平台审核\n              ")]),t._v(" "),i("div",{staticClass:"el-step__main"},[i("div",{staticClass:"mt2"},[i("span",{staticClass:"color cp",on:{click:t.urge}},[t._v("催一下")])])])]),t._v(" "),i("div",{staticClass:"el-step is-horizontal is-center",staticStyle:{"flex-basis":"25%","margin-right":"0px"}},[i("div",{staticClass:"el-step__head is-wait"},[i("div",{staticClass:"el-step__line",staticStyle:{"margin-right":"0px"}},[i("i",{staticClass:"el-step__line-inner",staticStyle:{"transition-delay":"-300ms","border-width":"0px",width:"0%"}})]),t._v(" "),i("div",{staticClass:"el-step__icon is-text"},[i("div",{staticClass:"el-step__icon-inner"},[t._v("3")])]),t._v("\n                运营商复核\n              ")]),t._v(" "),i("div",{staticClass:"el-step__main"},[i("div",{staticClass:"el-step__title is-wait"}),t._v(" "),i("div",{staticClass:"el-step__description is-wait"})])]),t._v(" "),i("div",{staticClass:"el-step is-horizontal is-center",staticStyle:{"flex-basis":"25%","max-width":"25%"}},[i("div",{staticClass:"el-step__head is-wait"},[i("div",{staticClass:"el-step__line"},[i("i",{staticClass:"el-step__line-inner"})]),t._v(" "),i("div",{staticClass:"el-step__icon is-text"},[i("div",{staticClass:"el-step__icon-inner"},[t._v("4")])]),t._v("\n                发送完成\n              ")]),t._v(" "),i("div",{staticClass:"el-step__main"},[i("div",{staticClass:"el-step__title is-wait"}),t._v(" "),i("div",{staticClass:"el-step__description is-wait"})])])])])])])],1):t._e(),t._v(" "),t.size>0?i("div",{staticClass:"sent-btn t-c p2 mt2"},[0===t.stepsActive?[i("el-button",{on:{click:function(e){return t.preview()}}},[t._v("预览")]),t._v(" "),i("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.nextStep()}}},[t._v("下一步")]),t._v(" "),0===t.customer.customerType?i("el-select",{attrs:{placeholder:"请选择"},model:{value:t.mmsType,callback:function(e){t.mmsType=e},expression:"mmsType"}},t._l(t.mmsTypeLists,function(e){return 0!==e.mmsType?i("el-option",{key:e.mmsType,attrs:{label:e.name,value:e.mmsType}}):t._e()}),1):t._e()]:t._e(),t._v(" "),1===t.stepsActive?[i("el-button",{on:{click:function(e){t.stepsActive=0}}},[t._v("上一步")]),t._v(" "),i("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.sent()}}},[t._v("提交发送")])]:t._e(),t._v(" "),2===t.stepsActive?[i("el-button",{on:{click:function(e){return t.$router.push({name:"VideoMmsSent"})}}},[t._v("查看待发")]),t._v(" "),i("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.reload()}}},[t._v("新建彩信")])]:t._e()],2):t._e(),t._v(" "),i("transition",{attrs:{name:"dialog-fade"}},[t.dialogPreview?i("div",{staticClass:"dialog dialog-min"},[i("div",{staticClass:"dialog-body"},[i("div",{staticClass:"dialog-header"},[t._v("\n          预览 "),i("i",{staticClass:"fr iconfont iconsystem-cancel-bold",on:{click:function(e){t.dialogPreview=!1}}})]),t._v(" "),i("div",{staticClass:"dialog-content c p2"},[i("div",{staticClass:"mms-preview"},[i("div",{staticClass:"slide"},[i("div",{staticClass:"slide-item",staticStyle:{display:"inline-block"}},[i("p",[t._v(t._s(t.previewTitle))])]),t._v(" "),t._l(t.item,function(e,s){return i("div",{key:s,staticClass:"slide-item"},[e.photopath?i("img",{attrs:{src:e.photopath}}):t._e(),t._v(" "),e.videopath?i("video",{attrs:{src:e.videopath,controls:""}}):t._e(),t._v(" "),e.voicepath?i("audio",{attrs:{src:e.voicepath,controls:""}}):t._e(),t._v(" "),e.txt?i("p",[i("el-input",{staticClass:"mms-txt-preview",attrs:{value:e.txt,type:"textarea",readonly:"",resize:"none",autosize:""}})],1):t._e()])})],2)])])])]):t._e()])],1)},staticRenderFns:[]},f=i("VU/8")(d,u,!1,null,null,null);e.default=f.exports},C6AZ:function(t,e,i){"use strict";e.a=function(){return[{mmsType:0,name:"全部",active:!0},{mmsType:22,name:"送福活动",active:!1},{mmsType:21,name:"春节",active:!1},{mmsType:1,name:"我的模板",active:!1},{mmsType:2,name:"生日",active:!1},{mmsType:3,name:"中秋节",active:!1},{mmsType:4,name:"端午节",active:!1},{mmsType:5,name:"圣诞节",active:!1},{mmsType:6,name:"元旦",active:!1},{mmsType:7,name:"冬至",active:!1},{mmsType:8,name:"元宵节",active:!1},{mmsType:9,name:"父亲节",active:!1},{mmsType:10,name:"儿童节",active:!1},{mmsType:11,name:"建军节",active:!1},{mmsType:12,name:"七夕节",active:!1},{mmsType:13,name:"教师节",active:!1},{mmsType:14,name:"国庆节",active:!1},{mmsType:15,name:"重阳节",active:!1},{mmsType:16,name:"腊八节",active:!1},{mmsType:17,name:"母亲节",active:!1},{mmsType:18,name:"情人节",active:!1},{mmsType:19,name:"植树节",active:!1},{mmsType:20,name:"测试模板",active:!1}]}},NkRn:function(t,e,i){var s=i("TQ3y").Symbol;t.exports=s},O4Lo:function(t,e,i){var s=i("yCNF"),a=i("RVHk"),n=i("kxzG"),c="Expected a function",l=Math.max,o=Math.min;t.exports=function(t,e,i){var r,p,v,m,d,u,f=0,_=!1,h=!1,g=!0;if("function"!=typeof t)throw new TypeError(c);function C(e){var i=r,s=p;return r=p=void 0,f=e,m=t.apply(s,i)}function y(t){var i=t-u;return void 0===u||i>=e||i<0||h&&t-f>=v}function b(){var t=a();if(y(t))return x(t);d=setTimeout(b,function(t){var i=e-(t-u);return h?o(i,v-(t-f)):i}(t))}function x(t){return d=void 0,g&&r?C(t):(r=p=void 0,m)}function T(){var t=a(),i=y(t);if(r=arguments,p=this,u=t,i){if(void 0===d)return function(t){return f=t,d=setTimeout(b,e),_?C(t):m}(u);if(h)return clearTimeout(d),d=setTimeout(b,e),C(u)}return void 0===d&&(d=setTimeout(b,e)),m}return e=n(e)||0,s(i)&&(_=!!i.leading,v=(h="maxWait"in i)?l(n(i.maxWait)||0,e):v,g="trailing"in i?!!i.trailing:g),T.cancel=function(){void 0!==d&&clearTimeout(d),f=0,r=u=p=d=void 0},T.flush=function(){return void 0===d?m:x(a())},T}},RVHk:function(t,e,i){var s=i("TQ3y");t.exports=function(){return s.Date.now()}},TQ3y:function(t,e,i){var s=i("blYT"),a="object"==typeof self&&self&&self.Object===Object&&self,n=s||a||Function("return this")();t.exports=n},UnEC:function(t,e){t.exports=function(t){return null!=t&&"object"==typeof t}},aCM0:function(t,e,i){var s=i("NkRn"),a=i("uLhX"),n=i("+66z"),c="[object Null]",l="[object Undefined]",o=s?s.toStringTag:void 0;t.exports=function(t){return null==t?void 0===t?l:c:o&&o in Object(t)?a(t):n(t)}},blYT:function(t,e,i){(function(e){var i="object"==typeof e&&e&&e.Object===Object&&e;t.exports=i}).call(e,i("DuR2"))},kxzG:function(t,e,i){var s=i("yCNF"),a=i("6MiT"),n=NaN,c=/^\s+|\s+$/g,l=/^[-+]0x[0-9a-f]+$/i,o=/^0b[01]+$/i,r=/^0o[0-7]+$/i,p=parseInt;t.exports=function(t){if("number"==typeof t)return t;if(a(t))return n;if(s(t)){var e="function"==typeof t.valueOf?t.valueOf():t;t=s(e)?e+"":e}if("string"!=typeof t)return 0===t?t:+t;t=t.replace(c,"");var i=o.test(t);return i||r.test(t)?p(t.slice(2),i?2:8):l.test(t)?n:+t}},mBRr:function(t,e,i){"use strict";var s=i("vLgD"),a=i("CKLt"),n=i("l6IN"),c=i("X2Oc"),l={name:"inputPhones",props:["frameJson","title"],data:function(){return{item:this.frameJson,previewTitle:this.title,recipient:{input:"",total:0,valid:0,invalid:0,invalidArr:""},activeName:"input",activeContactsName:"group",dialogInvalid:!1,fileName:"",repeatStr:"",sentType:1,sentTime:"",pickerOptions:{disabledDate:function(t){return t.getTime()<Date.now()-864e5}},contactsLists:[],multipleSelection:[]}},created:function(){var t=new Date;t.setMinutes(t.getMinutes()+30),this.sentTime=t},methods:{loadPhones:function(){var t=this,e=t.multipleSelection.map(function(t){return t.id});e.length<1?t.R("请选择分组!"):Object(s.a)("telephoneBook/loadPhones",{ids:e}).then(function(e){t.recipient.input=e.phones,t.recipient.total=e.phones.split(",").length,t.recipient.valid=e.phones.split(",").length,t.activeContactsName="phones"}).catch(function(){})},importFile:function(){var t=this;t.repeatStr="";var e=document.getElementById("file"),i=e.files[0].type,s=e.files[0].name,l=n.Loading.service();t.$nextTick(function(){Object(a.a)(e.files[0],"xlsx|xls|csv|txt").then(function(a){t.fileName=s,e.value="",l.close(),t.recipient.input=Object(c.p)(a,i),t.valHandle()}).catch(function(i){e.value="",t.fileName="",l.close(),t.R(i)})})},valHandle:function(){var t=this,e=Object(c.a)(t.recipient.input);if((e=e.split(",")).length>1e5)return t.R("号码数量不能超过10万！"),void(t.recipient.input="");var i=Object(c.k)(e),s="";for(var a in i)i[a]>1&&(s=s+a+" 重复 "+i[a]+"次</br>");s&&(t.repeatStr=s),e=e.filter(function(t){return t&&t.trim()});for(var n=Object(c.q)(e),l=[],o=[],r=0,p=n.length;r<p;r++){var v=Object(c.o)(n[r]);Object(c.l)(v)?l.push(v):o.push(v)}t.recipient.input=l.join(","),t.recipient.total=e.length,t.recipient.valid=l.length,t.recipient.invalid=o.length,t.recipient.invalidArr=o},getListGroups:function(){var t=this;Object(s.a)("telephoneBook/listGroups").then(function(e){t.contactsLists=e.rows}).catch(function(){})},handleSelectionChange:function(t){this.multipleSelection=t},sentData:function(){var t={};t.phones=this.recipient.input,t.sentType=this.sentType,t.sendTime=this.sentTime,this.$emit("sentData",t)},cl:function(t,e){(e=window.event||e).preventDefault(),e.stopPropagation();var i=this;i.repeatStr="",i.fileName="",i.recipient.input="",i.recipient.total=0,i.recipient.valid=0,i.recipient.invalid=0,i.recipient.invalidArr="",i.activeContactsName="group","book"==t&&i.getListGroups()}},watch:{"recipient.input":function(){this.sentData()},sentType:function(){this.sentData()},sentTime:function(){this.sentData()},activeName:function(t){this.cl(t)}}},o={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"mms-input-phones"},[i("dl",{staticClass:"c"},[i("dd",[i("div",{staticClass:"mms-preview"},[i("div",{staticClass:"slide"},[i("div",{staticClass:"slide-item",staticStyle:{display:"inline-block"}},[i("p",[t._v(t._s(t.previewTitle))])]),t._v(" "),t._l(t.item,function(e,s){return i("div",{key:s,staticClass:"slide-item"},[e.photopath?i("img",{attrs:{src:e.photopath}}):t._e(),t._v(" "),e.videopath?i("video",{attrs:{src:e.videopath,controls:""}}):t._e(),t._v(" "),e.voicepath?i("audio",{attrs:{src:e.voicepath,controls:""}}):t._e(),t._v(" "),e.txt?i("p",[i("el-input",{staticClass:"mms-txt-preview",attrs:{value:e.txt,type:"textarea",readonly:"",resize:"none",autosize:""}})],1):t._e()])})],2)])]),t._v(" "),i("dd",[i("el-card",{staticClass:"box-card"},[i("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[i("span",[i("b",[t._v("收件人")])])]),t._v(" "),i("div",{staticClass:"item-3"},[i("div",{staticClass:"alert",staticStyle:{"padding-left":"10px"}},[i("p",[t._v("建议单次输入、上传号码不要超过10万个，导入格式参考模板说明 "),i("a",{staticClass:"cp color",staticStyle:{"margin-left":"20px"},attrs:{href:"/static/client/tpl/tel.xlsx",download:"号码模板文件.xlsx"}},[t._v("模板下载")])])]),t._v(" "),i("div",{staticClass:"recipient mt2"},[i("el-tabs",{attrs:{type:"border-card"},model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},[i("el-tab-pane",{attrs:{label:"手动输入",name:"input"}},[i("div",{staticClass:"pane-input"},[i("textarea",{directives:[{name:"model",rawName:"v-model.trim",value:t.recipient.input,expression:"recipient.input",modifiers:{trim:!0}}],attrs:{rows:"10",placeholder:"请输入手机号码，多个号码请用逗号分隔（中英文逗号均可）或换行输入"},domProps:{value:t.recipient.input},on:{blur:[function(e){return t.valHandle()},function(e){return t.$forceUpdate()}],input:function(e){e.target.composing||t.$set(t.recipient,"input",e.target.value.trim())}}})])]),t._v(" "),i("el-tab-pane",{attrs:{label:"通讯录",name:"book"}},[i("div",{staticClass:"contacts-sent c"},[i("el-tabs",{attrs:{"tab-position":"left"},model:{value:t.activeContactsName,callback:function(e){t.activeContactsName=e},expression:"activeContactsName"}},[i("el-tab-pane",{attrs:{name:"group",label:"通讯录分组"}},[i("el-table",{attrs:{data:t.contactsLists,height:"260"},on:{"selection-change":t.handleSelectionChange}},[i("el-table-column",{attrs:{type:"selection",width:"55"}}),t._v(" "),i("el-table-column",{attrs:{label:"序号",type:"index",width:"50",align:"center"}}),t._v(" "),i("el-table-column",{attrs:{label:"分组名称",prop:"groupName"}}),t._v(" "),i("el-table-column",{attrs:{label:"号码数量",prop:"phoneNums"}})],1)],1),t._v(" "),i("el-tab-pane",{attrs:{disabled:!0,name:"phones",label:"选中的号码"}},[i("div",{staticClass:"contacts-phones"},[i("ul",{staticClass:"c"},t._l(t.recipient.input.split(","),function(e,s){return i("li",{key:s},[t._v(t._s(e))])}),0)])])],1),t._v(" "),"group"===t.activeContactsName?i("div",{staticClass:"t-r mt2"},[i("el-button",{attrs:{type:"primary",size:"small"},on:{click:function(e){return t.loadPhones()}}},[t._v("确认")])],1):t._e()],1)]),t._v(" "),i("el-tab-pane",{staticClass:"recipient-file",attrs:{label:"文件导入",name:"file"}},[i("label",{staticClass:"cp"},[i("input",{staticClass:"hide",attrs:{type:"file",id:"file",accept:".xls,.xlsx,.txt,.csv"},on:{change:function(e){return t.importFile(this)}}}),t._v(" "),t.fileName?i("div",[t._v("\n                    "+t._s(t.fileName)+" "),i("span",{staticClass:"color"},[t._v("重新上传")]),t._v(" "),i("span",{staticClass:"error cp",on:{click:function(e){return t.cl("file",e)}}},[t._v("删除文件")])]):i("div",{staticClass:"t-c"},[i("img",{attrs:{src:"/static/client/img/sms/6.png",alt:"点击上传文件"}}),t._v(" "),i("p",[t._v("点击上传文件")]),t._v(" "),i("p",{staticClass:"info"},[t._v("支持扩展名：.txt .csv .xls .xlsx")])])])])],1),t._v(" "),i("div",{staticClass:"recipient-tip t-r"},[t._v("\n              已添加 "+t._s(t.recipient.total)+" 个号码，去重过滤后，有效号码 "),i("span",{staticClass:"color"},[t._v(t._s(t.recipient.valid))]),t._v(" 个，无效号码 "),i("span",{staticClass:"color"},[t._v(t._s(t.recipient.invalid))]),t._v(" 个。\n              "),i("span",{directives:[{name:"show",rawName:"v-show",value:t.recipient.invalid>0||t.repeatStr,expression:"recipient.invalid > 0 || repeatStr"}],staticClass:"color cp btn",on:{click:function(e){t.dialogInvalid=!0}}},[t._v(" 查看无效号码")])])],1)])]),t._v(" "),i("el-card",{staticClass:"box-card mt2"},[i("div",{staticClass:"c",attrs:{slot:"header"},slot:"header"},[i("span",[i("b",[t._v("计划时间")])])]),t._v(" "),i("div",{staticClass:"sent-time"},[i("div",[i("el-radio",{attrs:{label:1},model:{value:t.sentType,callback:function(e){t.sentType=e},expression:"sentType"}},[t._v("立即发送")]),t._v(" "),i("el-radio",{attrs:{label:2},model:{value:t.sentType,callback:function(e){t.sentType=e},expression:"sentType"}},[t._v("定时发送")])],1),t._v(" "),i("div",{directives:[{name:"show",rawName:"v-show",value:2===t.sentType,expression:"sentType === 2"}],staticClass:"mt2"},[i("span",[t._v("请选择日期时间：")]),t._v(" "),i("el-date-picker",{attrs:{"picker-options":t.pickerOptions,clearable:!1,size:"small",type:"datetime",placeholder:"选择日期时间"},model:{value:t.sentTime,callback:function(e){t.sentTime=e},expression:"sentTime"}}),t._v(" "),i("p",{staticClass:"info",staticStyle:{"margin-left":"115px","margin-top":"10px"}},[t._v("定时发送只能选择当前时间之后的时间")])],1)])])],1)]),t._v(" "),i("transition",{attrs:{name:"dialog-fade"}},[t.dialogInvalid?i("div",{staticClass:"dialog access"},[i("div",{staticClass:"dialog-body"},[i("div",{staticClass:"dialog-header"},[t._v("\n          无效号码 "),i("i",{staticClass:"fr iconfont iconsystem-cancel-bold",on:{click:function(e){t.dialogInvalid=!1}}})]),t._v(" "),i("div",{staticClass:"dialog-content c p2"},[i("div",[i("p",{staticStyle:{"font-size":"16px"}},[t._v("无效号码：")]),t._v(" "),i("p",[t._v(t._s(t.recipient.invalidArr.join(",")))])]),t._v(" "),t.repeatStr?i("div",{staticClass:"mt2"},[i("p",{staticStyle:{"font-size":"16px"}},[t._v("重复号码：")]),t._v(" "),i("p",{domProps:{innerHTML:t._s(t.repeatStr)}})]):t._e()]),t._v(" "),i("div",{staticClass:"dialog-footer c p2"},[i("div",{staticClass:"fr"},[i("el-button",{on:{click:function(e){t.dialogInvalid=!1}}},[t._v("取消")])],1)])])]):t._e()])],1)},staticRenderFns:[]},r=i("VU/8")(l,o,!1,null,null,null);e.a=r.exports},uLhX:function(t,e,i){var s=i("NkRn"),a=Object.prototype,n=a.hasOwnProperty,c=a.toString,l=s?s.toStringTag:void 0;t.exports=function(t){var e=n.call(t,l),i=t[l];try{t[l]=void 0;var s=!0}catch(t){}var a=c.call(t);return s&&(e?t[l]=i:delete t[l]),a}},yCNF:function(t,e){t.exports=function(t){var e=typeof t;return null!=t&&("object"==e||"function"==e)}}});