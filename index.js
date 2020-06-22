function MobileSideBar__init() {
    var $btnToggleMobileSideBar = $('.btn-toggle-mobile-side-bar');

    $btnToggleMobileSideBar.click(function() {
        if ($(this).hasClass('active')) {
            $(this).removeClass('active');
        }
        else {
            $(this).addClass('active');
        }
    });
}

$(function() {
    MobileSideBar__init();
});