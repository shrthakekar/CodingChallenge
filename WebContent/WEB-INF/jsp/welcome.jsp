<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Trial list</title>
</head>
<body>	
	<%@ page import="com.clinicalTrial.beans.ClinicalTrialBean"
		import="java.util.List"
		import="java.util.Map"
		import="org.apache.commons.beanutils.BeanUtils"
	%>
	 
	
	<%	
		List<ClinicalTrialBean> list =  (List<ClinicalTrialBean>)request.getAttribute("trialList");		
		if(null!=list && !list.isEmpty())
		{
			int index=1;
	%>
		<table border="3px solid">
		<tr border="1px solid">
		<th>Row Number</th>
	<%	
			for(Map.Entry<String,String> property : BeanUtils.describe(list.get(0)).entrySet())
	   		{ 
				if(!property.getKey().equals("class") && !property.getKey().equals("id"))
				{%>
					<th><%=property.getKey()%></th>
			<%}
				}
			%>
	
	</tr>
	
	<%	for(ClinicalTrialBean trial : list)		
		{
	%>
	
		<tr>
		<td><%=index++%></td>
		<%
			for(Map.Entry<String,String> property : BeanUtils.describe(trial).entrySet())
			{
				if(!property.getKey().equals("class") && !property.getKey().equals("id"))
				{
					if(property.getValue()==null)
					{
				%>
					<td>  </td>
				<%
					}
					else 
					{
				%>	
					<td><%=property.getValue()%></td>
				<%	}
	    		}
			}	
	 	%></tr>
	 <%				
		}
	 %>	
	</table>
	<%			
		}
		else
		{
	%>
			<h4>No data to display</h4>
	<%	}	%>	
	
	
</body>
</html>