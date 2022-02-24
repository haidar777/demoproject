ACC.carousel = {

	_autoload: [
		["bindCarousel", $(".js-owl-carousel").length >0],
		"bindJCarousel"
	],

	carouselConfig:{
		"default":{
			navigation:true,
			navigationText : ["<span class='glyphicon glyphicon-chevron-left'></span>", "<span class='glyphicon glyphicon-chevron-right'></span>"],
			pagination:false,
			loop:true,
			center:true,
			itemsCustom : [[0, 3], [640, 3], [1024, 3], [1400, 3]]
		},
		"rotating-image":{
			navigation:false,
			pagination:true,
			singleItem : true
		},
		"lazy-reference":{
			navigation:true,
			navigationText : ["<span class='glyphicon glyphicon-chevron-left'></span>", "<span class='glyphicon glyphicon-chevron-right'></span>"],
			pagination:false,
			center:true,
			itemsDesktop : [5000,4],
			itemsDesktopSmall : [1200,4],
			itemsTablet: [768,4],
			itemsMobile : [480,4],
			lazyLoad:true
		}
	},

	bindCarousel: function(){

		$(".js-owl-carousel").each(function(){
			var $c = $(this);
			$.each(ACC.carousel.carouselConfig,function(key,config){
				if($c.hasClass("js-owl-"+key)){
					var $e = $(document).find(".js-owl-"+key);
					$e.owlCarousel(config);
				}
			});
		});

	},

	bindJCarousel: function ()
	{
		$(".modal").colorbox({
			onComplete: function ()
			{
				ACC.common.refreshScreenReaderBuffer();
			},
			onClosed: function ()
			{
				ACC.common.refreshScreenReaderBuffer();
			}
		});
		$('.svw').each( function(){
			$( this).waitForImages( function(){
				$(this).slideView({toolTip: true, ttOpacity: 0.6, autoPlay: true, autoPlayTime: 8000});
			});
		});
	}

};