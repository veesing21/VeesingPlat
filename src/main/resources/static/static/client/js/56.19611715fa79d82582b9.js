webpackJsonp([56],{gQHo:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=a("gRE1"),l=a.n(i),s=a("vLgD"),n=a("7biW"),r=a("RAp7"),o=a("X2Oc"),c={name:"receipt",mixins:[r.a],components:{"search-area":n.a},data:function(){return{searchData:[{type:"phone",show:!0,name:"手机号码"},{type:"content",show:!0,name:"短信内容"},{type:"receiptCode",show:!0,name:"回执状态码"}],defTag:"phone,content,receiptCode",total:0,lists:[],pageSizes:[10,30,50,100],listQuery:{page:1,limit:10,offset:0,starttime:"",endtime:"",pdType:6,json:"[]"}}},created:function(){this.getList()},methods:{theadChange:function(t){this.listQuery.receiptStatus=l()(t)[0][0],this.getList(1)},exportFile:function(){if(this.listQuery.starttime){var t=Object(o.s)(this.listQuery);window.open("/globalSmsCode/receipt/export?"+t)}else this.R("请选择日期时间！")},getList:function(t){var e=this;t&&(e.listQuery.page=1,e.listQuery.offset=0),e.listQuery.offset=(e.listQuery.page-1)*e.listQuery.limit,Object(s.a)("globalSmsCode/receipt/list",e.listQuery).then(function(t){e.lists=t.rows,e.total=t.total}).catch(function(){})}}},p={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"bgw p2"},[a("div",{staticClass:"query"},[a("el-button",{attrs:{type:"primary",size:"small"},on:{click:function(e){return t.exportFile()}}},[t._v("导出")]),t._v(" "),a("el-button-group",[a("el-button",{staticClass:"tc-btn",attrs:{size:"small",autofocus:""},on:{click:function(e){return t.btnTime("today")}}},[t._v("今 日")]),t._v(" "),a("el-button",{staticClass:"tc-btn",attrs:{size:"small"},on:{click:function(e){return t.btnTime("week")}}},[t._v("近7日")]),t._v(" "),a("el-button",{staticClass:"tc-btn",attrs:{size:"small"},on:{click:function(e){return t.btnTime("month")}}},[t._v("近30日")]),t._v(" "),a("el-date-picker",{staticClass:"el-button el-button--default",attrs:{"popper-class":"veesing-date-picker",editable:!1,clearable:!1,size:"small",type:"datetimerange",format:"yyyy/MM/dd HH:mm:ss","start-placeholder":"开始日期","end-placeholder":"结束日期","value-format":"yyyy-MM-dd HH:mm:ss","default-time":["00:00:00","23:59:59"],"picker-options":t.pickerOptions},on:{change:function(e){return t.createTime()}},model:{value:t.datePickerVal,callback:function(e){t.datePickerVal=e},expression:"datePickerVal"}})],1),t._v(" "),a("search-area",{attrs:{search:t.searchData,defTag:t.defTag},on:{searchFun:t.searchFun}})],1),t._v(" "),a("el-table",{attrs:{data:t.lists},on:{"filter-change":t.theadChange}},[a("el-table-column",{attrs:{align:"center",label:"序号",type:"index",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{label:"任务ID",prop:"id",width:"100"}}),t._v(" "),a("el-table-column",{attrs:{label:"手机号码",prop:"phone",width:"140"}}),t._v(" "),a("el-table-column",{attrs:{label:"短信内容",prop:"content","show-overflow-tooltip":!0,"min-width":"200"}}),t._v(" "),a("el-table-column",{attrs:{label:"时间",prop:"sendTime","min-width":"200"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("div",{staticStyle:{"font-size":"12px","line-height":"18px"}},[a("p",[t._v("发送时间："+t._s(e.row.sendTime))]),t._v(" "),a("p",[t._v("回执时间："+t._s(e.row.receiptTime))])])]}}])}),t._v(" "),a("el-table-column",{attrs:{align:"center",label:"回执状态",width:"100",filters:[{text:"提交失败",value:0},{text:"提交成功",value:1},{text:"未知",value:3}],"filter-multiple":!1,"filter-placement":"bottom-end"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("p",[0==e.row.receiptStatus?a("span",{staticClass:"point point-error"},[t._v("提交失败")]):1==e.row.receiptStatus?a("span",{staticClass:"point point-success"},[t._v("提交成功")]):a("span",{staticClass:"point point-info"},[t._v("未知")])])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"回执状态码",prop:"receiptCode","min-width":"100"}}),t._v(" "),a("el-table-column",{attrs:{label:"推送时间",prop:"pushTime","min-width":"170"}}),t._v(" "),a("el-table-column",{attrs:{label:"推送结果",prop:"pushResult","min-width":"100","show-overflow-tooltip":!0}})],1),t._v(" "),a("div",{staticClass:"pagination-container"},[a("el-pagination",{attrs:{"current-page":t.listQuery.page,"page-size":t.listQuery.limit,"page-sizes":t.pageSizes,total:t.total,background:"",layout:"total, prev, pager, next, sizes, jumper"},on:{"current-change":t.handleCurrentChange,"size-change":t.handleSizeChange}})],1)],1)},staticRenderFns:[]},u=a("VU/8")(c,p,!1,null,null,null);e.default=u.exports}});