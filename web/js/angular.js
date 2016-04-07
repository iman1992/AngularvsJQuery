var app = angular.module('MyApp', []);

app.controller('DefaultController', ['$scope','$http', function ($scope,$http){
        
        $scope.members;
    
    $http.get('http://localhost:8084/AngularVsJQuery/api/members').then(function (res){
       $scope.members = res.data; 
    });
    
    $scope.showFriends = function(id){
            for (var i = 0, max = $scope.members.length; i < max; i++) {
                if ($scope.members[i].id === id) {
                    $scope.friends = $scope.members[i].friends;
                }
            }
    };
        
}]);