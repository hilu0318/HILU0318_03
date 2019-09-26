function setCustListTable(listObj, valueObj){
  var nSize = valueObj.length;
  console.log(nSize);
  var tObj = {};
  var tTxt = "";
  for(var i = 0; i < nSize; i++){
    tObj = valueObj[i];
    console.log(Object.keys(tObj)[i]);
    console.log(tObj.no);
    tTxt = tTxt + "<tr class='" + i + "'>" +
                  "  <td class='" + i + "'>" + tObj.no + "</td>" +
                  "  <td class='" + i + "'>" + tObj.cust_no + "</td>" +
                  "  <td class='" + i + "'>" + tObj.cust_nm + "</td>" +
                  "  <td class='" + i + "'>" + tObj.cons_emp_nm + "</td>" +
                  "</tr>";
  }
  listObj.innerHTML = tTxt;
}

function setListTable(listObj, valueObj){
  var nSize = valueObj.length;
  console.log(nSize);
  var tObj = {};
  var tTxt = "";
  var tLst = [];
  for(var i = 0; i < nSize; i++){
    tObj = valueObj[i];
    tLst = Object.keys(tObj);
    console.log(Object.keys(tObj)[i]);
    console.log(tObj.no);
    tTxt = tTxt + "<tr class='" + i + "'>";
    for(var j = 0; j < tLst.length; j++){
      tTxt = tTxt + "  <td class='" + i + " " + tLst[j] + "'>" + tObj[tLst[j]] + "</td>";
    }
    tTxt = tTxt + "</tr>";
  }
  listObj.innerHTML = tTxt;
}

function getReqInst(){
  var tReq;
  try{
    tReq = new XMLHttpRequest();
  }catch(e1){
    try{
      tReq = new ActiveXObjext('Msxml2.XMLHTTP');
    }catch(e2){
      tReq = new ActiveXObjext('Microsoft.XMLHTTP');
    }
  }
  return tReq;
}

function setConsEmpnoTable(listObj, valueObj){

  var nSize = valueObj.length;

  var tObj = {};
  var tTxt = "";
  var tLst = [];
  for(var i = 0; i < nSize; i++){
    tObj = valueObj[i];
    tLst = Object.keys(tObj);

    tTxt = tTxt + "<tr class='" + tObj[tLst[0]] + "'>";
    tTxt = tTxt + "  <td class='text-center '" + tObj[tLst[0]] + "'>";
    tTxt = tTxt + "    <input type='checkbox' name='checkbox' onchange='onChangeCheck(event)'>";
    tTxt = tTxt + "  </td>";
    tTxt = tTxt + "  <td class='text-center '" + tObj[tLst[0]] + " " + tLst[0] + "'>" + tObj[tLst[0]] + "</td>";
    tTxt = tTxt + "  <td class='" + tObj[tLst[0]] + " " + tLst[1] + "'>" + tObj[tLst[1]] + "</td>";
    tTxt = tTxt + "  <td class='" + tObj[tLst[0]] + " " + tLst[2] + "'>" + tObj[tLst[2]] + "</td>";
    tTxt = tTxt + "  <td class='" + tObj[tLst[0]] + " " + tLst[3] + "'>";
    tTxt = tTxt + "    <input class='input_asgn_ord input_align_right col-md-12' name='input_asgn_ord'";
    tTxt = tTxt + "    type='number' value='" + tObj[tLst[3]] + "' onchange=''>";
    tTxt = tTxt + "    <input type='text' value='" + tObj[tLst[3]] + "' name='asgn_ord' hidden>";
    tTxt = tTxt + "  </td>";
    tTxt = tTxt + "  <td class='" + tObj[tLst[0]] + " " + tLst[4] + "'>";
    tTxt = tTxt + "    <input class='input_asgn_rate input_align_right col-md-12' name='input_asgn_rate'";
    tTxt = tTxt + "    type='number' value='" + tObj[tLst[4]] + "' onkeydown='onChangeRate(event)' onchange=''>";
    tTxt = tTxt + "    <input type='text' value='" + tObj[tLst[4]] + "' name='asgn_rate' hidden>";
    tTxt = tTxt + "  </td>";
    tTxt = tTxt + "</tr>";
  }
  listObj.innerHTML = tTxt;
}

function onclickSaveAsgnInfo(event){
  //var tdLst =
}

function onChangeRate(event){
  var tValue = event.target.value;
  if(tValue > 100){
    event.target.value = 100;
  }
  else if(tValue < 0){
    event.target.value = 0;
  }

  var tNum = event.target.parentElement.getAttribute("class");
  //dLog(event.target.value + " : " + )
  if(Number(event.target.value) != Number(document.getElementsByName("asgn_rate").item(tNum).value)){
    document.getElementsByName("checkbox").item(tNum).checked = true;
  }else{
    dLog("11111111");
    document.getElementsByName("checkbox").item(tNum).checked = false;
  }

}

function onChangeCheck(event){
  dLog(event.target.checked);
}

function getChecked(tElement){
  if(tElement.checked){
    return true;
  }else{
    return false;
  }
}

function dLog(txt){
  console.log(txt + "\n");
}
