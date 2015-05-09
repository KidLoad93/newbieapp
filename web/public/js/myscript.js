$(function() {
	$('#exampleModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  var recipient = button.data('toan') // Extract info from data-* attributes
  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
  var modal = $(this)
  modal.find('.modal-title').text('New message to ' + recipient)
  modal.find('.modal-body input').val(recipient)
});
	//auto active
	$("#search a:contains('NewbieApp')").parent().addClass('active');
	$("#add a:contains('Add Student')").parent().addClass('active');
	$("#change a:contains('Change')").parent().addClass('active');
	// make menu auto load
	$('ul.nav li.dropdown').hover(function(){
$('.dropdown-menu', this).fadeIn();
},function(){
$('.dropdown-menu', this).fadeOut('fast');
	} );
	$("[data-toggle='tooltip']").tooltip({animation:true});
}) ;

$('#myModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
            var pid = button.data('id') 
  var name = button.data('name') 
  var age = button.data('age') 
  var sex = button.data('sex') 
  var home= button.data('home') 
 
  var modal = $(this)
  modal.find('#id').val(id)
  modal.find('#name').val(name)
  modal.find('#age').val(age)
  if(sex==0)  modal.find('#female').prop("checked",true) 
  if(sex==1)  modal.find('male').prop("checked",true) 
  
  modal.find('#home').val(home)
  
});