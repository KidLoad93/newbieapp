console.log("welcome to this");
console.log($(".search"));
$(".search").keyup(function () {
    var text = this.value;
    console.log(text);
    if(text === "") {
        $(".item").each(function (index) {
           $(this).show(); 
        });
    };
    
    $(".item").each(function (index) {
        var item = $(this).children("td.2");
            var patt = new RegExp(text);
            var isMatch = patt.test(item.text());
            if (!isMatch)
                $(this).hide();
       
    });
});
