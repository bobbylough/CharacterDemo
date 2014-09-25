<html>
<head><title></title>
<body>
<div id="header">

</div>
 
<div id="content">
     
  <fieldset>
    <legend>Add User</legend>
 <form name="user" action="add.html" method="post">
    Firstname: <input type="text" name="firstname" /> <br/>
    Lastname: <input type="text" name="lastname" />   <br/>
    <input type="submit" value="   Save   " />
  </form>
  </fieldset>
  <br/>
  
  
  <table class="datatable">
    <tr>
        <th>Firstname</th>
    </tr>
    <#list characterList as character>
    <tr>
        <td>${character.name}</td>
    </tr>
    </#list>
  </table>
 
</div>  
</body>
</html>  