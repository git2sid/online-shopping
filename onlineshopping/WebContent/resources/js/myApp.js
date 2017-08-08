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
		if(menu=='home') break;
	$('#listproducts').addClass('active');
	$('#a_'+menu).addClass('active');
	break;
	}
	
	
	
	//code for the jquery datatable
	//crea/ting an array
	/*var products=[
		
	            ['1','abc'],
	            ['2','ghi'],
	            ['3','jkl'],
	            ['4','mno'],
	            ['5','pqr'],
	            ['6','stu'],
	            ['7','vwx'],
	            ['8','def']
	        	
	            ];    */        
	            
		var $table=$('#productListTable');
		if($table.length)
			{
			/*console.log("inside the table");*/
			var jsonURL='';
			if(window.categoryId=='')
				{
				jsonURL=window.contextRoot+'/json/data/all/products';
				}
			else
				{
				jsonURL=window.contextRoot+'/json/data/category/'+window.categoryId+'/products';
				}
			
		$table.DataTable(
				{
					
			lengthMenu :[[3,5,10,-1],['3 records','5 records','10 records','all records']],		
			pageLength:5,
			/*data:products*/
			ajax:
				{
				url:jsonURL,
				dataSrc:''
				},
				
				columns:[
					{
					data:'code',
						mRender: function(data,type,row)
						{
							return '<img src="'+window.contextRoot+'/static/images/'+data+'.jpg " class="myImagesOfProducts">';
						}
			
					},
					{
						data:'name'
			
					},
					{
						data:'brand'
			
					},
					{
						data:'unitPrice',
						mRender: function(data,type,row)
						{
							return '&#8377; '+data
						}
			
					},
					{
						data:'quantity'
			
					},
					{
						data:'id',
						bSortable:false,
						mRender: function(data,type,row)
						{
							
		/*note:for every data here there must be a seperate entry in table for that like <th> or sth*/
							var str='';
						
							str = str+'<a href="'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;' ;
							str = str+'<a href="'+window.contextRoot+'/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
							return str;
						}
			
					}
	
				]
				});
			}
		
		}
		);






