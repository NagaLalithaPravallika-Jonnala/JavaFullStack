function Registration() {
  return (
         <div width="50%">
            <fieldset>
                <h3 align ="center"><b><big>REGISTRATION FORM</big></b></h3>
                <form>
                    <table align="center" cellspacing="20px">
                        <tr>
                            <td><label>Name</label></td>
                            <td><input type="text" autofocus></input></td>
                        </tr>
                        <tr>
                            <td><label>Gender</label></td>
                            <td><input type="radio" name="s" id="1"></input>
                            <label for="1">Male</label>
                            <input type="radio" name="s" id="2"></input>
                            <label for="2">Female</label>
                            <input type="radio" name="s" id="3"></input>
        <label for="3">Others</label></td>
        </tr>
        <tr>
            <td><label>Date of Birth</label></td>
            <td><input type="date"></input></td>
        </tr>
        <tr>
            <td><label>Email id <span>*</span></label></td>
            <td><input type="text" required></input></td>
        </tr>
        <tr>
            <td><label>Mobile No.</label></td>
            <td><input type="number"></input></td>
        </tr>
        <tr>
            <td><label>Whatsapp No.</label></td>
            <td> <input type="number"></input></td>
        </tr>
        <tr>
            <td><label>Father Name</label></td>
            <td><input type="text"></input></td>
        </tr>
        <tr>
            <td><label>Mother Name</label></td>
            <td><input type="text"></input></td>
        </tr>
        <tr>
            <td><label>Parent/Gaurdian No.</label></td>
            <td><input type="number"></input></td>
        </tr>
        <tr>
            <td><label>SSC(%/CGPA)<span>*</span></label></td>
            <td><input type="number" required></input></td>
         </tr>
        <tr>
            <td><label>Inter/Dip(%/CGPA) <span>*</span></label></td>
            <td><input type="number" required></input></td>
        </tr>
        <tr>
            <td><label>Currently pursuing(year)</label></td>
            <td><select>
            <option>1st</option>
            <option>2nd</option>
            <option>3rd</option>
            <option>4th</option>
        </select></td>
        </tr>
        <tr>
            <td><label>Upload Resume(10MB)</label></td>
            <td><input type="file"></input></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"></input></td>
        </tr>
        </table>
    </form>
    </fieldset>
    </div>
  );
}

export default Registration;