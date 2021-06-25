function solution(param0) {
   var answer = [];
   let fileFullName, fileName, ext;
   let obj=[];

   for (let el of param0) {
      fileFullName = el.split(“/”)[0];
      if (fileName.indexOf(“_”) !== -1) {
         fileName = fileName.split(“_”)[0];
      }
      ext = fileFullName.split(“.”)[1];
      let idx = obj.findIndex(o => o.name == fileName && o.ext = ext);
      if (idx == -1) {
         obj.push({name: fileName, ext: ext, cnt:1});
      } else {
         obj[idx].cnt++;
      }
   }

   for (let el of obj) {
      if (el.cnt > 1) {
         answer.push(el.name+”.”+el.ext);
         answer.push(el.cnt+””)
      }
   }

   return answer;
}

