function togglePanel(panelId, cookieName) {
    if(eltHasClass($(panelId), 'mode_expand')) {
        eraseCookie(cookieName); 
        $(panelId).className='border_panel mode_min';
    } else { 
        createCookie(cookieName,'any_value', '');
        $(panelId).className='border_panel mode_expand';
	}
}