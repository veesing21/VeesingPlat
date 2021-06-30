webpackJsonp([16],{v5gc:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var i=a("vLgD"),n=a("7biW"),s=a("RAp7"),o=a("X2Oc"),l={name:"todo",mixins:[s.a],components:{"search-area":n.a},data:function(){return{searchData:[{type:"title",show:!0,name:"彩信标题"},{type:"state",name:"审核状态",show:!0,value:[{name:"驳回",value:0},{name:"审核通过",value:1},{name:"待审核",value:2},{name:"审核中",value:4}]}],defTag:"title",total:0,lists:[],pageSizes:[10,30,50,100],listQuery:{page:1,limit:10,offset:0,starttime:"",endtime:"",json:"[]",pdType:7},item:"",previewTitle:"",dialogPreview:!1}},created:function(){this.getList()},methods:{opinion:function(t,e){var a=this;t&&a.R("原因："+t),e&&a.$nextTick(function(){a.R("备注："+e)})},immediately:function(t){var e=this;e.$confirm("您确定要发送吗？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(i.b)("mms/todo/send",{id:t}).then(function(t){e.getList()}).catch(function(){})}).catch(function(){})},cancel:function(t){var e=this;e.$confirm("您确定要取消发送吗？","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(i.b)("mms/todo/cancel",{id:t}).then(function(t){e.getList()}).catch(function(){})}).catch(function(){})},del:function(t){var e=this;e.$confirm("您确定要删除文件吗?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){Object(i.a)("mms/todo/delete",{id:t}).then(function(t){e.getList()}).catch(function(){})}).catch(function(){})},preview:function(t){var e=this;t?(e.item=Object(o.f)(JSON.parse(t.frameJson)),e.previewTitle=t.title):(e.item=e.frameJson,e.previewTitle=e.title),e.dialogPreview=!0,e.$nextTick(function(){$(".slide").scrollTop(0)})},getList:function(t){var e=this;t&&(e.listQuery.page=1,e.listQuery.offset=0),e.listQuery.offset=(e.listQuery.page-1)*e.listQuery.limit,Object(i.a)("mms/todo/list",e.listQuery).then(function(t){e.lists=t.rows,e.total=t.total}).catch(function(){})}}},c={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"bgw p2"},[a("div",{staticClass:"query"},[a("el-button-group",[a("el-button",{staticClass:"tc-btn",attrs:{size:"small",autofocus:""},on:{click:function(e){return t.btnTime("today")}}},[t._v("今 日")]),t._v(" "),a("el-button",{staticClass:"tc-btn",attrs:{size:"small"},on:{click:function(e){return t.btnTime("week")}}},[t._v("近7日")]),t._v(" "),a("el-button",{staticClass:"tc-btn",attrs:{size:"small"},on:{click:function(e){return t.btnTime("month")}}},[t._v("近30日")]),t._v(" "),a("el-date-picker",{staticClass:"el-button el-button--default",attrs:{"popper-class":"veesing-date-picker",editable:!1,clearable:!1,size:"small",type:"datetimerange",format:"yyyy/MM/dd HH:mm:ss","start-placeholder":"开始日期","end-placeholder":"结束日期","value-format":"yyyy-MM-dd HH:mm:ss","default-time":["00:00:00","23:59:59"],"picker-options":t.pickerOptions},on:{change:function(e){return t.createTime()}},model:{value:t.datePickerVal,callback:function(e){t.datePickerVal=e},expression:"datePickerVal"}})],1),t._v(" "),a("search-area",{attrs:{search:t.searchData,defTag:t.defTag},on:{searchFun:t.searchFun}})],1),t._v(" "),a("el-table",{attrs:{data:t.lists}},[a("el-table-column",{attrs:{align:"center",label:"序号",type:"index",width:"80"}}),t._v(" "),a("el-table-column",{attrs:{label:"ID",prop:"id"}}),t._v(" "),a("el-table-column",{attrs:{label:"彩信标题",prop:"title","show-overflow-tooltip":!0,"min-width":"170px"}}),t._v(" "),a("el-table-column",{attrs:{label:"计划时间",width:"170"},scopedSlots:t._u([{key:"default",fn:function(e){return[e.row.sendTime?a("span",[t._v(t._s(e.row.sendTime))]):a("span",[t._v("无定时")])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"发送条数",prop:"numbers"}}),t._v(" "),a("el-table-column",{attrs:{label:"计费条数",prop:"numbers"}}),t._v(" "),a("el-table-column",{attrs:{label:"提交时间",prop:"createTime",width:"170"}}),t._v(" "),a("el-table-column",{attrs:{align:"center",label:"审核状态"},scopedSlots:t._u([{key:"default",fn:function(e){return[0==e.row.state?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-error"},[t._v("驳回")])],1):t._e(),t._v(" "),1==e.row.state?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-success"},[t._v("审核通过")])],1):t._e(),t._v(" "),2==e.row.state?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-warning"},[t._v("待审核")])],1):t._e(),t._v(" "),3==e.row.state?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-info"},[t._v("草稿")])],1):t._e(),t._v(" "),4==e.row.state?a("p",{staticClass:"td-btn"},[a("font",{staticClass:"point point-warning"},[t._v("审核中 ")])],1):t._e()]}}])}),t._v(" "),a("el-table-column",{attrs:{align:"center",fixed:"right",label:"操作",width:"180"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("p",{staticClass:"operating"},[a("a",{on:{click:function(a){return t.preview(e.row)}}},[t._v("预览")]),t._v(" "),0==e.row.state?a("a",{on:{click:function(a){return t.opinion(e.row.opnition,e.row.remark)}}},[t._v("查看原因")]):t._e(),t._v(" "),3==e.row.state?a("a",{on:{click:function(a){return t.immediately(e.row.id)}}},[t._v("立即发送")]):t._e(),t._v(" "),0==e.row.state||3==e.row.state?a("a",{on:{click:function(a){return t.del(e.row.id)}}},[t._v("删除")]):t._e(),t._v(" "),2==e.row.state?a("a",{on:{click:function(a){return t.cancel(e.row.id)}}},[t._v("取消发送")]):t._e()])]}}])})],1),t._v(" "),a("div",{staticClass:"pagination-container"},[a("el-pagination",{attrs:{"current-page":t.listQuery.page,"page-size":t.listQuery.limit,"page-sizes":t.pageSizes,total:t.total,background:"",layout:"total, prev, pager, next, sizes, jumper"},on:{"current-change":t.handleCurrentChange,"size-change":t.handleSizeChange}})],1),t._v(" "),a("transition",{attrs:{name:"dialog-fade"}},[t.dialogPreview?a("div",{staticClass:"dialog dialog-min"},[a("div",{staticClass:"dialog-body"},[a("div",{staticClass:"dialog-header"},[t._v("\n          预览 "),a("i",{staticClass:"fr iconfont iconsystem-cancel-bold",on:{click:function(e){t.dialogPreview=!1}}})]),t._v(" "),a("div",{staticClass:"dialog-content c p2"},[a("div",{staticClass:"mms-preview"},[a("div",{staticClass:"slide"},[a("div",{staticClass:"slide-item",staticStyle:{display:"inline-block"}},[a("p",[t._v(t._s(t.previewTitle))])]),t._v(" "),t._l(t.item,function(e,i){return a("div",{key:i,staticClass:"slide-item"},[e.photopath?a("img",{attrs:{src:e.photopath}}):t._e(),t._v(" "),e.videopath?a("video",{attrs:{src:e.videopath,controls:""}}):t._e(),t._v(" "),e.voicepath?a("audio",{attrs:{src:e.voicepath,controls:""}}):t._e(),t._v(" "),e.txt?a("p",[a("el-input",{staticClass:"mms-txt-preview",attrs:{value:e.txt,type:"textarea",readonly:"",resize:"none",autosize:""}})],1):t._e()])})],2)])])])]):t._e()])],1)},staticRenderFns:[]},r=a("VU/8")(l,c,!1,null,null,null);e.default=r.exports}});