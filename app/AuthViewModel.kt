import android.content.Context
import androidx.navigation.NavHostController

class AuthViewModel (var navController: NavHostController, var context: Context){
    var mAuth: FirebaseAuth
    init {
        mAuth= FirebaseAuth.getInstance()
    }


}