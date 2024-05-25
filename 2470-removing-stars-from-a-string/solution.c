char* removeStars(char* s) {
    int n=strlen(s),top=0;
    for(int i=0;i<n;i++){
        if(s[i]!='*')
        {
            s[top++]=s[i];
        }
        else{
            top--;
        }
    }
    s[top]=NULL;
    return s;
}
