$(function()
		{
	switch(menu)
	{
	case 'ContactUs' :
		$('#contact').addClass('active');
		break;
		
	case 'AboutUs' :
		$('#about').addClass('active');
		break;
		
	case 'All Products' :
		$('#listproducts').addClass('active');
		break;
	default :
		if(menu==home) break;
	$('#listproducts').addClass('active');
	$('#a_'+menu).addClass('active');
	break;
	}
		}
		);