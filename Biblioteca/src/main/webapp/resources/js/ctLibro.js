function soloLetras(e){
       key = e.keyCode || e.which;
       tecla = String.fromCharCode(key).toLowerCase();
       letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
       especiales = "8-37-39-46";

       tecla_especial = false
       for(var i in especiales){
            if(key == especiales[i]){
                tecla_especial = true;
                break;
            }
        }

        if(letras.indexOf(tecla)==-1 && !tecla_especial){
            return false;
        }
    }

function soloNumero(n){
    key = n.keyCode || n.which;
    tecla = String.fromCharCode(key).toLowerCase();
    
    numeros = " 0123456789.";
    especiales = "8-37-39-46-44";

    tecla_especial = false
    for(var i in especiales){
         if(key == especiales[i]){
             tecla_especial = true;
             break;
         }
     }

     if(numeros.indexOf(tecla)==-1 && !tecla_especial){
         return false;
     }
 }

function Decimal()
{
   
   var i,exceptions=[8,46,37,39,13,9]; 
   var isException=false;
   var isDot=(190==event.keyCode);      
   var k=String.fromCharCode(event.keyCode);

   for(i=0;i<exceptions.length;i++)
      if(exceptions[i]==event.keyCode)
	     isException=true;

   if(isNaN(k) && (!isException) && (!isDot))
      event.returnValue=false;
   else{
      var p=new String(currency.value+k).indexOf(".");
      if((p<currency.value.length-2 || isDot) && p>-1 && (!isException))
         event.returnValue=false;
      else if(currency.value.length>=15 && (!isException))
         event.returnValue=false;
   }
   
}


function add_ctLibro() {
	$('#AddCtLibro_Dialog').dialog("option", "title", 'Agregar Libro');
	$('#AddCtLibro_Dialog').dialog('open');
	
}

function edit_ctLibro(id) {

	$.get("libro/get/" + id, function(result) {
		$("#AddCtLibro_Dialog").html(result);
		$("#AddCtLibro_Dialog").dialog("option", "title", 'Editar Libro');
		$("#AddCtLibro_Dialog").dialog('open');

		// initializeDatePicker();
	});
	

}

function initializeDatePicker() {
	$(".datepicker").datepicker({
		dateFormat : "yy-mm-dd",
		changeMonth : true,
		changeYear : true,
		showButtonPanel : true
	});
}

function resetDialog(form) {

	form.find("input").val("");
	form.find("#iLibro").val("0");
	
}

$(document).ready(function() {

	$('#AddCtLibro_Dialog').dialog({

		autoOpen : false,
		position : 'center',
		modal : true,
		resizable : false,
		width : 800,
		buttons : {
			"Save" : function() {
				$('#Form_ctLibro').submit();
			},
			"Cancel" : function() {
				$(this).dialog('close');
			}
		},
		close : function() {

			resetDialog($('#Form_ctLibro'));

			$(this).dialog('close');
		}
	});


	initializeDatePicker();
});