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
	//data-spy
	$("body").scrollspy({target:'.example'})
	//auto active
	$("#home a:contains('Home')").parent().addClass('active');
	$("#about a:contains('About')").parent().addClass('active');
	$("#exercise a:contains('Exercise')").parent().addClass('active');
	$("#life-style-diet a:contains('Life Style')").parent().addClass('active');
	$("#life-style-habit a:contains('Life Style')").parent().addClass('active');
	$("#life-style-yoga a:contains('Life Style')").parent().addClass('active');
	$("#science a:contains('Science&Theory')").parent().addClass('active');
	// make menu auto load
	$('ul.nav li.dropdown').hover(function(){
$('.dropdown-menu', this).fadeIn();
},function(){
$('.dropdown-menu', this).fadeOut('fast');
	} );
	$("[data-toggle='tooltip']").tooltip({animation:true});
}) ;

