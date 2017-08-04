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
		
	case 'Products' :
		$('#products').addClass('active');
		break;
	default :
	$('#home').addClass('active');
	break;
	}
		}
		);