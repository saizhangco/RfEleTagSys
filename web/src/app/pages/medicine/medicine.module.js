/**
 * @author v.lugovsky
 * created on 16.12.2015
 */
(function () {
  'use strict';

  angular.module('BlurAdmin.pages.medicine', [])
      .config(routeConfig);

  /** @ngInject */
  function routeConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
        .state('medicine', {
          url: '/medicine',
          templateUrl: 'app/pages/medicine/medicine.html',
          controller: 'MedicinePageCtrl',
          title: 'Medicine',
          sidebarMeta: {
            icon: 'ion-android-home',
            order: 0,
          },
        });
  }

})();
