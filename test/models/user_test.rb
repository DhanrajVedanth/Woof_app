require 'test_helper'

class UserTest < ActiveSupport::TestCase
  def setup
    @user = User.new(email: 'draghun@ncsu.edu', name: "Dhanraj", username: 'draghun')
  end
  # test "valid user" do
  #   assert @user.valid?
  # end

  # test "invalid without email" do
  #   @user.email = nil
  #   refute @user.valid?,
  #   assert_not_nil @user.errors[:email]
  # end
end