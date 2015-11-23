<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="actionUrl" value="/libro/registro" />

<form:form id="Form_ctLibro" commandName="ctLibro" method="post"
	action="${actionUrl}" class="pure-form pure-form-aligned">

	<fieldset>
		<legend></legend>

		<table>
			<tr>
				<td><form:label path="iLibro">
						<spring:message text="ID" />
					</form:label></td>
				<td><form:input path="iLibro"  readonly="true"/></td>
			</tr>
			<tr>
				<td><form:label path="cNombre">
						<spring:message text="Titulo" />
					</form:label></td>
				<td><form:input path="cNombre" placeholder="Ej. Tango" onkeypress="return soloLetras(event)"/></td>
			</tr>

			
			<tr>
				<td><form:label path="iEditorial">
						<spring:message text="Editorial" />
					</form:label></td>
				<td><form:input path="iEditorial" placeholder="Ej. 10" onkeypress="return soloNumero(event)"/></td>

			</tr>
			
			<tr>
				<td><form:label path="cAutor">
						<spring:message text="Autor" />
					</form:label></td>
				<td><form:input path="cAutor" placeholder="Ej. 15" onkeypress="return soloLetras(event)"/></td>

			</tr>
			
			<tr>
				<td><form:label path="iMateria">
						<spring:message text="Materia" />
					</form:label></td>
				<td><form:input path="iMateria" placeholder="Ej. 1000.00" onkeypress="return soloNumero(event)"/></td>

			</tr>
			
			
			<tr>
				<td><form:label path="lEstatus">
						<spring:message text="Estatus" />
					</form:label></td>
				<td><form:checkbox path="lEstatus" /></td>

			</tr>
			
			<tr>
				<td><form:label path="cObs">
						<spring:message text="Observaciones" />
					</form:label></td>
				<td><form:input path="cObs" placeholder="Ej. 15" onkeypress="return soloLetras(event)"/></td>

			</tr>

		</table>

	</fieldset>
	
</form:form>