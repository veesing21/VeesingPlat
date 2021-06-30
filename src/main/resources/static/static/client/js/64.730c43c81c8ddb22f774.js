webpackJsonp([64],{"8ATG":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=a("vLgD"),s=a("7biW"),i={name:"todo",mixins:[a("RAp7").a],components:{"search-area":s.a},data:function(){return{searchData:[{type:"content",show:!0,name:"短信内容"},{type:"cerStatus",name:"审核状态",show:!0,value:[{name:"审核中",value:2},{name:"审核通过",value:1},{name:"驳回",value:0},{name:"草稿",value:3}]}],defTag:"content",total:0,lists:[],pageSizes:[10,30,50,100],listQuery:{page:1,limit:10,offset:0,starttime:"",endtime:"",pdType:5,json:"[]"},item:"",dialogDetail:!1}},created:function(){this.getList()},methods:{d:function(t){this.item=t,this.dialogDetail=!0},opinion:function(t,e){var a=this;t&&a.R("原因："+t),e&&a.$nextTick(function(){a.R("备注："+e)})},immediately:function(t){var e=this;e.$confirm("您确定要发送吗？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(n.b)("sms/todo/send",{id:t}).then(function(t){e.getList()}).catch(function(){})}).catch(function(){})},cancel:function(t){var e=this;e.$confirm("您确定要取消发送吗？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(n.b)("sms/todo/cancel",{id:t}).then(function(t){e.getList()}).catch(function(){})}).catch(function(){})},getList:function(t){var e=this;t&&(e.listQuery.page=1,e.listQuery.offset=0),e.listQuery.offset=(e.listQuery.page-1)*e.listQuery.limit,Object(n.a)("sms/todo/list",e.listQuery).then(function(t){e.lists=t.rows,e.total=t.total}).catch(function(){})}}},o={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"bgw p2"},[a("div",{staticClass:"query"},[a("el-button-group",[a("el-button",{staticClass:"tc-btn",attrs:{size:"small",autofocus:""},on:{click:function(e){return t.btnTime("today")}}},[t._v("今 日")]),t._v(" "),a("el-button",{staticClass:"tc-btn",attrs:{size:"small"},on:{click:function(e){return t.btnTime("week")}}},[t._v("近7日")]),t._v(" "),a("el-button",{staticClass:"tc-btn",attrs:{size:"small"},on:{click:function(e){return t.btnTime("month")}}},[t._v("近30日")]),t._v(" "),a("el-date-picker",{staticClass:"el-button el-button--default",attrs:{"popper-class":"veesing-date-picker",editable:!1,clearable:!1,size:"small",type:"datetimerange",format:"yyyy/MM/dd HH:mm:ss","start-placeholder":"开始日期","end-placeholder":"结束日期","value-format":"yyyy-MM-dd HH:mm:ss","default-time":["00:00:00","23:59:59"],"picker-options":t.pickerOptions},on:{change:function(e){return t.createTime()}},model:{value:t.datePickerVal,callback:function(e){t.datePickerVal=e},expression:"datePickerVal"}})],1),t._v(" "),a("search-area",{attrs:{search:t.searchData,defTag:t.defTag},on:{searchFun:t.searchFun}})],1),t._v(" "),a("el-table",{attrs:{data:t.lists}},[a("el-table-column",{attrs:{align:"center",label:"序号",type:"index",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{label:"ID",prop:"id"}}),t._v(" "),a("el-table-column",{attrs:{label:"短信内容","show-overflow-tooltip":!0,"min-width":"200px"},scopedSlots:t._u([{key:"default",fn:function(e){return[e.row.tplContent?a("span",[t._v(t._s(e.row.tplContent))]):a("span",[t._v("${变量}")])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"计划时间",width:"170"},scopedSlots:t._u([{key:"default",fn:function(e){return[e.row.jobTime?a("span",[t._v(t._s(e.row.jobTime))]):a("span",[t._v("无定时")])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"发送条数",prop:"phoneNum"}}),t._v(" "),a("el-table-column",{attrs:{label:"计费条数",prop:"costNum"}}),t._v(" "),a("el-table-column",{attrs:{label:"提交时间",prop:"createTime",width:"170"}}),t._v(" "),a("el-table-column",{attrs:{align:"center",label:"审核状态"},scopedSlots:t._u([{key:"default",fn:function(e){return[0==e.row.cerStatus?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-error"},[t._v("驳回")])],1):t._e(),t._v(" "),1==e.row.cerStatus?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-success"},[t._v("审核通过")])],1):t._e(),t._v(" "),2==e.row.cerStatus?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-warning"},[t._v("等待审核")])],1):t._e(),t._v(" "),3==e.row.cerStatus?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-info"},[t._v("草稿")])],1):t._e()]}}])}),t._v(" "),a("el-table-column",{attrs:{align:"center",fixed:"right",label:"操作",width:"180"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("p",{staticClass:"operating"},[a("a",{on:{click:function(a){return t.d(e.row)}}},[t._v("详情")]),t._v(" "),0==e.row.cerStatus?a("a",{on:{click:function(a){return t.opinion(e.row.opinion,e.row.remark)}}},[t._v("查看原因")]):t._e(),t._v(" "),2==e.row.cerStatus?a("a",{on:{click:function(a){return t.cancel(e.row.id)}}},[t._v("取消发送")]):t._e(),t._v(" "),3==e.row.cerStatus?a("a",{on:{click:function(a){return t.immediately(e.row.id)}}},[t._v("立即发送")]):t._e()])]}}])})],1),t._v(" "),a("div",{staticClass:"pagination-container"},[a("el-pagination",{attrs:{"current-page":t.listQuery.page,"page-size":t.listQuery.limit,"page-sizes":t.pageSizes,total:t.total,background:"",layout:"total, prev, pager, next, sizes, jumper"},on:{"current-change":t.handleCurrentChange,"size-change":t.handleSizeChange}})],1),t._v(" "),a("transition",{attrs:{name:"dialog-fade"}},[a("div",{directives:[{name:"show",rawName:"v-show",value:t.dialogDetail,expression:"dialogDetail"}],staticClass:"dialog list-detail"},[a("div",{staticClass:"dialog-body"},[a("div",{staticClass:"dialog-header"},[t._v("\n          详情 "),a("i",{staticClass:"fr iconfont iconsystem-cancel-bold",on:{click:function(e){t.dialogDetail=!1}}})]),t._v(" "),a("div",{staticClass:"dialog-content c p2"},[a("div",{staticClass:"c"},[a("div",[a("span",[t._v("计划ID：")]),t._v(" "),a("span",[t._v(t._s(t.item.id))])]),t._v(" "),a("div",[a("span",[t._v("提交时间：")]),t._v(" "),a("span",[t._v(t._s(t.item.createTime))])]),t._v(" "),t.item.jobTime?a("div",[a("span",[t._v("计划时间：")]),t._v(" "),a("span",[t._v(t._s(t.item.jobTime))])]):t._e()]),t._v(" "),a("div",{staticClass:"c"},[a("div",[a("span",[t._v("发送条数：")]),t._v(" "),a("span",[t._v(t._s(t.item.phoneNum))])]),t._v(" "),a("div",[a("span",[t._v("计费条数：")]),t._v(" "),a("span",[t._v(t._s(t.item.costNum))])]),t._v(" "),a("div",[a("span",[t._v("审核：")]),t._v(" "),0==t.item.cerStatus?a("span",{staticClass:"error"},[t._v("驳回")]):t._e(),t._v(" "),1==t.item.cerStatus?a("span",{staticClass:"success"},[t._v("审核通过")]):t._e(),t._v(" "),2==t.item.cerStatus?a("span",{staticClass:"warning"},[t._v("等待审核")]):t._e(),t._v(" "),3==t.item.cerStatus?a("span",{staticClass:"info"},[t._v("草稿")]):t._e()])]),t._v(" "),a("div",{staticClass:"c"},[a("div",[a("span",[t._v("短信内容：")]),t._v(" "),a("span",[t._v(t._s(t.item.content))])]),t._v(" "),t.item.opinion?a("div",[a("span",[t._v("拒绝原因：")]),t._v(" "),a("span",[t._v(t._s(t.item.opinion))])]):t._e(),t._v(" "),t.item.remark?a("div",[a("span",[t._v("备注：")]),t._v(" "),a("span",[t._v(t._s(t.item.remark))])]):t._e()])])])])])],1)},staticRenderFns:[]},l=a("VU/8")(i,o,!1,null,null,null);e.default=l.exports}});