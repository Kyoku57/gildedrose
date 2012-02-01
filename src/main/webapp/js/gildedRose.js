$(function() {
	window.AppView = Backbone.View.extend({

		el : $("#items"),

		//itemTemplate: _.template($('#item-template').html()),

		// Delegated events for creating new items, and clearing completed ones.
		events : {
		},

		initialize : function() {
			/*
			 * this.input = this.$("#new-todo");
			 * 
			 * Todos.bind('add', this.addOne, this); Todos.bind('reset',
			 * this.addAll, this); Todos.bind('all', this.render, this);
			 * 
			 * Todos.fetch();
			 */
		},

		render : function() {
			/*
			 * this.$('#todo-stats').html(this.statsTemplate({ total:
			 * Todos.length, done: Todos.done().length, remaining:
			 * Todos.remaining().length }));
			 */
		},

	});

	// Finally, we kick things off by creating the **App**.
	window.App = new AppView;

});