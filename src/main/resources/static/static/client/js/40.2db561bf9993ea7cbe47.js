webpackJsonp([40],{"i/W+":function(e,t,l){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=l("gRE1"),s=l.n(a),i=l("vLgD"),r=l("7biW"),n=l("RAp7"),o=l("X2Oc"),p={name:"receipt",mixins:[n.a],components:{"search-area":r.a},data:function(){return{defTag:"phone,content,receiptCode",total:0,lists:[],pageSizes:[10,30,50,100],listQuery:{page:1,limit:10,offset:0,starttime:"",endtime:"",pdType:3,preId:"",content:""}}},created:function(){var e=this,t=e.$route.params.taskId;e.listQuery.preId=t,e.listQuery.pdType="SmsReceipt"===e.$route.name?3:5,e.getList()},methods:{theadChange:function(e){this.listQuery.receiptStatus=s()(e)[0][0],this.getList(1)},exportFile:function(){if(this.total>1e6)this.R("最多可导出100万,请重新筛选");else{var e=Object(o.s)(this.listQuery);window.open("/sms/log/receipt/export?"+e)}},getList:function(e){var t=this;e&&(t.listQuery.page=1,t.listQuery.offset=0),t.listQuery.offset=(t.listQuery.page-1)*t.listQuery.limit,Object(i.a)("sms/log/receipt/list",t.listQuery).then(function(e){t.lists=e.rows,t.total=e.total}).catch(function(){})},reset:function(){this.listQuery.preId="",this.listQuery.sendStatus="",this.listQuery.content="",this.listQuery.cerStatus="",this.listQuery.phone="",this.resetTime(),this.getList()},resetTime:function(){var e=new Date,t=Object(o.e)(e,"yyyy/MM/dd"),l=new Date;l.setTime(l.getTime());var a=Object(o.e)(l,"yyyy/MM/dd")+" 00:00:00",s=t+" 23:59:59";this.listQuery.starttime=a,this.listQuery.endtime=s,this.datePickerVal=[new Date(a),new Date(s)]}}},c={render:function(){var e=this,t=e.$createElement,l=e._self._c||t;return l("div",{staticClass:"bgw p2"},[l("div",{staticClass:"query"},[l("el-form",{attrs:{inline:!0,model:e.listQuery,size:"small","label-width":"70px","label-position":"left"}},[l("el-form-item",{attrs:{label:"任务 ID"}},[l("el-input",{attrs:{placeholder:"任务 ID"},model:{value:e.listQuery.preId,callback:function(t){e.$set(e.listQuery,"preId",t)},expression:"listQuery.preId"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"手机号"}},[l("el-input",{attrs:{placeholder:"手机号"},model:{value:e.listQuery.phone,callback:function(t){e.$set(e.listQuery,"phone",t)},expression:"listQuery.phone"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"下发状态"}},[l("el-select",{attrs:{placeholder:"下发状态"},model:{value:e.listQuery.sendStatus,callback:function(t){e.$set(e.listQuery,"sendStatus",t)},expression:"listQuery.sendStatus"}},[l("el-option",{attrs:{label:"全部",value:""}}),e._v(" "),l("el-option",{attrs:{label:"未激活",value:"0"}}),e._v(" "),l("el-option",{attrs:{label:"成功",value:"1"}}),e._v(" "),l("el-option",{attrs:{label:"处理中",value:"2"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"回执状态"}},[l("el-select",{attrs:{placeholder:"回执状态"},model:{value:e.listQuery.receiptStatus,callback:function(t){e.$set(e.listQuery,"receiptStatus",t)},expression:"listQuery.receiptStatus"}},[l("el-option",{attrs:{label:"全部",value:""}}),e._v(" "),l("el-option",{attrs:{label:"失败",value:"0"}}),e._v(" "),l("el-option",{attrs:{label:"成功",value:"1"}}),e._v(" "),l("el-option",{attrs:{label:"未知",value:"2"}})],1)],1),e._v(" "),l("el-form-item",{attrs:{label:"短信内容"}},[l("el-input",{attrs:{placeholder:"短信内容"},model:{value:e.listQuery.content,callback:function(t){e.$set(e.listQuery,"content",t)},expression:"listQuery.content"}})],1),e._v(" "),l("el-form-item",{attrs:{label:"下发时间"}},[l("el-date-picker",{attrs:{"popper-class":"veesing-date-picker",editable:!1,clearable:!1,type:"datetimerange",format:"yyyy/MM/dd HH:mm:ss","start-placeholder":"开始日期","end-placeholder":"结束日期","value-format":"yyyy-MM-dd HH:mm:ss","default-time":["00:00:00","23:59:59"],"picker-options":e.pickerOptions},on:{change:function(t){return e.createTime()}},model:{value:e.datePickerVal,callback:function(t){e.datePickerVal=t},expression:"datePickerVal"}})],1),e._v(" "),l("el-form-item",[l("el-button",{attrs:{type:"primary"},on:{click:e.getList}},[e._v("查询")]),e._v(" "),l("el-button",{on:{click:e.reset}},[e._v("重置")]),e._v(" "),l("el-button",{attrs:{type:"primary"},on:{click:e.exportFile}},[e._v("导出")])],1)],1)],1),e._v(" "),l("el-table",{attrs:{data:e.lists},on:{"filter-change":e.theadChange}},[l("el-table-column",{attrs:{label:"任务ID",prop:"preId",width:"100",align:"center"}}),e._v(" "),l("el-table-column",{attrs:{label:"手机号码",prop:"phone",width:"140",align:"center"}}),e._v(" "),l("el-table-column",{attrs:{label:"短信内容",prop:"content","show-overflow-tooltip":!0,"min-width":"200"}}),e._v(" "),l("el-table-column",{attrs:{label:"发送时间","min-width":"170",prop:"sendTime",align:"center"}}),e._v(" "),l("el-table-column",{attrs:{align:"center",label:"发送状态",width:"100"},scopedSlots:e._u([{key:"default",fn:function(t){return[l("p",[0===t.row.sendStatus?l("span",{staticClass:"point point-error"},[e._v("未激活")]):1===t.row.sendStatus?l("span",{staticClass:"point point-success"},[e._v("成功")]):l("span",{staticClass:"point point-info"},[e._v("处理中")])])]}}])}),e._v(" "),l("el-table-column",{attrs:{label:"回执时间","min-width":"170",prop:"receiptTime",align:"center"}}),e._v(" "),l("el-table-column",{attrs:{align:"center",label:"回执状态",width:"100"},scopedSlots:e._u([{key:"default",fn:function(t){return[l("p",[0===t.row.receiptStatus?l("span",{staticClass:"point point-error"},[e._v("失败")]):1===t.row.receiptStatus?l("span",{staticClass:"point point-success"},[e._v("成功")]):l("span",{staticClass:"point point-info"},[e._v("未知")])])]}}])}),e._v(" "),l("el-table-column",{attrs:{label:"回执码",prop:"receiptCode","min-width":"100",align:"center"}}),e._v(" "),l("el-table-column",{attrs:{label:"推送时间",prop:"pushTime","min-width":"170",align:"center"}}),e._v(" "),l("el-table-column",{attrs:{label:"推送响应",prop:"pushResult","min-width":"170"}})],1),e._v(" "),l("div",{staticClass:"pagination-container"},[l("el-pagination",{attrs:{"current-page":e.listQuery.page,"page-size":e.listQuery.limit,"page-sizes":e.pageSizes,total:e.total,background:"",layout:"total, prev, pager, next, sizes, jumper"},on:{"current-change":e.handleCurrentChange,"size-change":e.handleSizeChange}})],1)],1)},staticRenderFns:[]},u=l("VU/8")(p,c,!1,null,null,null);t.default=u.exports}});